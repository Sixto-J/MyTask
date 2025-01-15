import javax.swing.*;

public class ControlPanel extends JPanel {

    private final JPanel jp1;
    private OK messageOK;
    private Cancel messageCancel;

    public ControlPanel() {
        messageOK = new OK();
        messageCancel = new Cancel();
        this.jp1 = new JPanel();
        // jp1.setSize(100, 50);
    }

    public JPanel getP1() {
        return jp1;
    }
}
