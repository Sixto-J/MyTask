import javax.swing.*;
import java.awt.*;

public class MyView extends JFrame {
    private final JFrame myFrame;
    private Viewer viewer;

    public MyView(){

        viewer = new Viewer();
        viewer.setBounds(0, 0, 800, 400);
        this.myFrame = new JFrame("JFrame");

        myFrame.setSize(900, 500);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setLayout(null);

        //myFrame.add(new Viewer());
        myFrame.add(viewer);
        myFrame.setVisible(true);
        //super(jp1);


    }

    public JFrame getMyFrame() {
        return myFrame;
    }
}


