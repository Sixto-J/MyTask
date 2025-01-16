import javax.swing.*;
import java.awt.*;

public class MyView extends JFrame {
    private final JFrame myFrame;
    private Viewer viewer;

    public MyView(){

        viewer = new Viewer();
        viewer.setBounds(0, 0, 800, 800);
        this.myFrame = new JFrame("JFrame");

        myFrame.setSize(1000, 1000);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setLayout(new FlowLayout());

        ControlPanel cp1 = new ControlPanel();
        cp1.setBounds(50,50,400,400);
        cp1.getMessageOK().setPreferredSize(new Dimension(150, 50));
        cp1.getMessageCancel().setPreferredSize(new Dimension(150, 50));


        JButton button1 = new JButton("Click Me");
        button1.setPreferredSize(new Dimension(150, 50));
        myFrame.add(button1);

        myFrame.pack();
        myFrame.add(viewer);
        myFrame.setVisible(true);
        //myFrame.add(new Viewer());
        //super(jp1);


    }

    public JFrame getMyFrame() {
        return myFrame;
    }
}