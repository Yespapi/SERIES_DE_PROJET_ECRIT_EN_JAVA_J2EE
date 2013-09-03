package guilayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class GridEx {
    private JFrame theFrame = new JFrame("Grid Lsyout");
    private JButton[] buttons = {
        new JButton("Button one"),
        new JButton("Button two"),
        new JButton("Button three"),
        new JButton("Button four"),
        new JButton("Button five"),
        new JButton("Button six")
    };
    
    public void show() {
        theFrame.setLayout(new GridLayout(3, 2));
        for (int i = 0; i < buttons.length; i++) {
            theFrame.add(buttons[i]);
        }
        theFrame.pack();
        theFrame.setVisible(true);
    }
}
