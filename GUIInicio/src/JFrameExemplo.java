import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.FlowLayout;

public class JFrameExemplo extends JFrame{
    public JFrameExemplo() {
        super("Janela Principal");
        this.setBounds(500, 500, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        for (int i = 0; i < 6; i++) {
            this.add(new JButton(""+i));
        }
        this.add(new JTextField("Meu Texto", 15));
        this.setVisible(true);
    }
}
