import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyView extends JFrame implements Runnable{

    private final JFrame myFrame;
    private Viewer viewer;
    private Thread myThread;
    private Thread myThread2;
    private int valor;

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

        myFrame.setLocationRelativeTo(null);

        // Create a button to start the thread
        JButton startButton = new JButton("Start Thread");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startMyThread();
            }
        });

        // Add the button to the JFrame
        myFrame.add(startButton);

        JButton button1 = new JButton("Click Me");
        button1.setPreferredSize(new Dimension(150, 50));
        myFrame.add(button1);

        myFrame.pack();
        myFrame.add(viewer);
        myFrame.setVisible(true);
        //myFrame.add(new Viewer());
        //super(jp1);

    }


    private void startMyThread() {
        // Check if the thread is already running
        if (myThread == null || !myThread.isAlive()) {
            myThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    // Your thread's code goes here
                    for (int i = 0; i < 10; i++) {
                        valor = valor + 1;
                        System.out.println("Thread running y valor vale: " + valor);
                        try {
                            Thread.sleep(10); // Sleep for 1 second
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt(); // Restore interrupted status
                        }
                    }
                }
            });

            if (myThread2 == null || !myThread2.isAlive()) {
                myThread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // Your thread's code goes here
                        for (int i = 10; i > 0; i--) {
                            valor = valor - 1;
                            System.out.println("Thread 2 running y valor vale: " + valor);
                            try {
                                Thread.sleep(10); // Sleep for 1 second
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt(); // Restore interrupted status
                            }
                        }
                    }
                });

                myThread.start();// Start the thread
                myThread2.start();


            } else {
                System.out.println("Thread is already running.");
            }
        }

    }



    public JFrame getMyFrame() {
        return myFrame;
    }

    @Override
    public void run() {
    }





 /*
        Thread thread1 = new Thread(new MyView() {
            int i = 0;
            @Override
            public void run() {
                while (i < 1001){
                    i = i+1;
                }
                System.out.println("Thread is running and i is equal to "+i);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            int i = 0;
            @Override
            public void run() {

                while (i < 1001){
                    i=i-1;
                }
                System.out.println("Thread is running and i is equal to "+i);
            }
        });


        thread1.start();
        thread2.start();

*/

}