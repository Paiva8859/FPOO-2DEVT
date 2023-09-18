import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContainerComponentes extends JFrame{
    int i = 0;
    public ContainerComponentes() {
        super("Janela Container");
        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        this.add(panel1);
        JButton btn1 = new JButton("Clique Aqui");
        JLabel label = new JLabel("N° de cliques:");

        panel1.add(btn1);
        panel1.add(label);

        btn1.addActionListener(e -> {
            i++;
            label.setText("N° de cliques: " + i);
        });

        this.setVisible(true);
        
    }
}
