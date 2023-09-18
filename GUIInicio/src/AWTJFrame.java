import java.awt.Frame;

public class AWTJFrame extends Frame {
    public AWTJFrame() {
        super("Minha primeira janela AWT");
        this.setSize(400, 400);
        this.setVisible(true);
        this.setResizable(false);
    }
}
