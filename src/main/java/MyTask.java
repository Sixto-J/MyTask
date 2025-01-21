
import javax.swing.*;

public class MyTask {

    public MyTask(){

    }

    public static void main(String[] args) {


        // Create and display the JFrame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                MyView myview1 = new MyView();
                myview1.setVisible(true);
            }
        });


















        /*myview1.getP1()
        ControlPanel c1 = new ControlPanel();
        JPanel panel1 = c1.getP1();
        JFrame jf1 = myview1.getMyFrame();
        jf1.add(panel1);
        myview1.getP1();
        panel1.setVisible(true);
        jf1.setVisible(true);*/



        // botton listener thread per pintar algo en el canvas clase graphics, cambiar alguna caracteristica del canva

    }
}
// Data Type Objects*/
