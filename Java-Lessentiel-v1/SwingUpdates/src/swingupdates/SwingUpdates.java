package swingupdates;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class SwingUpdates {

    private JScrollPane theScroller;
    private JFrame theFrame;
    private JButton theButton;
    private JTextArea theText;

    public void go() {
        theFrame = new JFrame("Swing Updates");
        theFrame.setLayout(new GridLayout(2, 1));

        theButton = new JButton("Click Me");
        theText = new JTextArea("edit this");
        theScroller = new JScrollPane(theText);


        theButton.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        System.out.println("Button was clicked!");
                        System.out.println("UI thread name is: "
                                + Thread.currentThread().getName());
                        new SwingWorker() {

                            @Override
                            protected Object doInBackground() throws Exception {
                                System.out.println("Starting...!");
                                for (int i = 0; i < 5000000; i++) {
                                    new Date();
                                }
                                System.out.println("Done...!");
                                return null;
                            }
                        }.execute();

                    }
                });

        theFrame.add(theButton);
        theFrame.add(theScroller);

        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setBounds(10, 10, 300, 200);
        theFrame.setVisible(true);
        System.out.println("Main thread name is: " + Thread.currentThread().getName());
        for (;;) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    theText.append("\nTickle " + new Date());
                }
            });

        }

    }

    public static void main(String[] args) {
        new SwingUpdates().go();
    }
}
