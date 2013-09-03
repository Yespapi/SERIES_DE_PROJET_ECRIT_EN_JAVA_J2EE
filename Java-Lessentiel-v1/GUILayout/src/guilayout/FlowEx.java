/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guilayout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author simon
 */
class FlowEx {
    private JFrame theFrame = new JFrame("Flow Layout");
    private JButton[] buttons = {
        new JButton("A Button"),
        new JButton("Thin"),
        new JButton("A really rather wide Button in the layout"),
        new JButton("Button four"),
        new JButton("Button five"),
        new JButton("Button six")
    };
    
    public void show() {
        theFrame.setLayout(new FlowLayout());
        for (int i = 0; i < buttons.length; i++) {
            theFrame.add(buttons[i]);
        }
        theFrame.pack();
        theFrame.setVisible(true);
    }
}
