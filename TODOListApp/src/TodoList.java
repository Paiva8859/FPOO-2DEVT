import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TodoList extends JFrame {
    // Declaração de componentes da interface
    private JPanel mainPanel;
    private JTextField taskInputField;
    private JButton addButton;
    private JList<Task> taskList;
    private DefaultListModel<Task> listModel;
    private List<Task> tasks;
    private JComboBox<String> filterComboBox;
    private JButton markDoneButton;
    private JButton markDoingButton;
    private JButton deleteButton;

    public TodoList() {
        // Configuração da janela
        setTitle("To-Do List App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);

        // Inicialização de componentes da interface
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        tasks = new ArrayList<>();
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        taskList.setCellRenderer(new TaskCellRenderer());

        taskInputField = new JTextField();
        addButton = new JButton("Adicionar");
        markDoneButton = new JButton("Concluída");
        markDoingButton = new JButton("Em Progresso");
        deleteButton = new JButton("Excluir");

        filterComboBox = new JComboBox<>(new String[]{"Todas", "Ativas", "Concluídas"});

        // Configuração de painéis para organização da interface
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(taskInputField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        JPanel actionButtonPanel = new JPanel();
        actionButtonPanel.add(markDoneButton);
        actionButtonPanel.add(markDoingButton);
        actionButtonPanel.add(deleteButton);

        JPanel filterPanel = new JPanel();
        filterPanel.add(new JLabel("Filtro: "));
        filterPanel.add(filterComboBox);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(actionButtonPanel);
        buttonPanel.add(filterPanel);

        // Organização dos painéis na janela
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH); 
        mainPanel.add(new JScrollPane(taskList), BorderLayout.CENTER);

        add(mainPanel);

        // Configuração de ouvintes de eventos (event listeners)
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        markDoneButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                markTaskDone();
            }
        });

        markDoingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                markTaskDoing();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteTask();
            }
        });

        filterComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                filterTasks();
            }
        });

        // Torna a janela visível
        setVisible(true);
    }

    // Função para adicionar uma tarefa à lista
    private void addTask() {
        String taskDescription = taskInputField.getText().trim();
        if (!taskDescription.isEmpty()) {
            Task newTask = new Task(taskDescription);
            tasks.add(newTask);
            listModel.addElement(newTask);
            taskInputField.setText("");
        }
    }

    // Função para marcar uma tarefa como concluída
    private void markTaskDone() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            Task task = tasks.get(selectedIndex);
            task.setDone(true);
            listModel.set(selectedIndex, task);
        }
    }

    // Função para marcar uma tarefa como "em progresso"
    private void markTaskDoing() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            Task task = tasks.get(selectedIndex);
            task.setDone(false);
            task.setDoing(true);
            listModel.set(selectedIndex, task);
        }
    }

    // Função para excluir uma tarefa da lista
    private void deleteTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            tasks.remove(selectedIndex);
            listModel.remove(selectedIndex);
        }
    }

    // Função para filtrar as tarefas com base na seleção no ComboBox
    private void filterTasks() {
        String filter = (String) filterComboBox.getSelectedItem();
        listModel.clear();
        for (Task task : tasks) {
            if (filter.equals("Todas") || (filter.equals("Ativas") && !task.isDone()) || (filter.equals("Concluídas") && task.isDone())) {
                listModel.addElement(task);
            }
        }
    }
}
