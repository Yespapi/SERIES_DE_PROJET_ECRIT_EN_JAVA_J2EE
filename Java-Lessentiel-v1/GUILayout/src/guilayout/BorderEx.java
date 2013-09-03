package guilayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderEx {
    private JFrame theFrame = new JFrame("Border Layout");
    private JButton northButton = new JButton("North");
    private JButton southButton = new JButton("South");
    private JButton eastButton = new JButton("East");
    private JButton westButton = new JButton("West");
    private JButton centerButton = new JButton("Center");
    
    public void show() {
        theFrame.setLayout(new BorderLayout());
        theFrame.add(northButton, BorderLayout.NORTH);
        theFrame.add(southButton, BorderLayout.SOUTH);
        theFrame.add(eastButton, BorderLayout.EAST);
        theFrame.add(westButton, BorderLayout.WEST);
        theFrame.add(centerButton, BorderLayout.CENTER);
        theFrame.pack();
        theFrame.setVisible(true);
    }
}
