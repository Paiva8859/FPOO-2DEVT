import javax.swing.*;
import java.awt.*;

public class TaskCellRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        // Chama o método da classe pai para obter o componente padrão de renderização
        Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        // Converte o valor (que é uma tarefa) em um objeto do tipo Task
        Task task = (Task) value;

        // Personaliza a cor de fundo do componente com base no estado da tarefa
        if (task.isDone()) {
            component.setBackground(Color.green); // Tarefa concluída, fundo verde
        } else if(task.isDoing()) {
            component.setBackground(Color.yellow); // Tarefa em andamento, fundo amarelo
        } else {
            component.setBackground(list.getBackground()); // Tarefa não concluída nem em andamento, fundo padrão da lista
        }

        // Retorna o componente modificado para renderização da célula na lista
        return component;
    }
}
