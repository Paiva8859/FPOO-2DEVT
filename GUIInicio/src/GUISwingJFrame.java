import javax.swing.JFrame;

public class GUISwingJFrame extends JFrame{
    public GUISwingJFrame() {
        super("Minha primeira janela GUI Swing");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
