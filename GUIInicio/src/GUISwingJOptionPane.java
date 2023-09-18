import javax.swing.JOptionPane;


public class GUISwingJOptionPane extends JOptionPane{
    String msg = "Mensagem com JOptionPane";
public GUISwingJOptionPane() {
    super();
    JOptionPane.showMessageDialog(getComponentPopupMenu(), msg, msg, 0, icon);
}
    
}