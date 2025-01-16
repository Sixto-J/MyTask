import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    private final JPanel jp1;
    private OK messageOK;
    private Cancel messageCancel;

    public ControlPanel() {

        this.messageOK = new OK("ok");
        this.messageCancel = new Cancel("cancel");

        this.jp1 = new JPanel();
        // jp1.setSize(100, 50);
    }

    public JPanel getP1() {
        return jp1;
    }
    public Cancel getMessageCancel() {
        return messageCancel;
    }
    public void setMessageCancel(Cancel messageCancel) {
        this.messageCancel = messageCancel;
    }
    public OK getMessageOK() {
        return messageOK;
    }
    public void setMessageOK(OK messageOK) {
        this.messageOK = messageOK;
    }
}