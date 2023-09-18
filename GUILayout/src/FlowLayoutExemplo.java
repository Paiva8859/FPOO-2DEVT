import javax.swing.*;
import java.awt.*;

public class FlowLayoutExemplo {
    public FlowLayoutExemplo() {
        JFrame window = new JFrame("Window");
        FlowLayout flow = new FlowLayout();
        window.setLayout(flow);

        JLabel label = new JLabel("informe o n° de botões");
        JTextField panel = new JTextField("Insira o N° de botões");
        JButton btn = new JButton("Confirmar");
        btn.addActionListener(e -> {
            int i = Integer.parseInt(panel.getText());
            for (int j = 0; j < i; j++) {
                window.add( new JButton(""+(j+1)));
                window.pack();
            }
        });

        window.add(label);
        window.add(panel);
        window.add(btn);
        window.setDefaultCloseOperation(2);
        window.pack();
        window.setVisible(true);
    }
}
