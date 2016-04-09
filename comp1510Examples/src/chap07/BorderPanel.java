package chap07;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Represents the panel in the LayoutDemo program that demonstrates
 * the border layout manager.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class BorderPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 3650474060579667548L;

    /**
    * Sets up this panel with a button in each area of a border
    * layout to show how it affects their position, shape, and size.
    */
    public BorderPanel() {
        setLayout(new BorderLayout());

        setBackground(Color.green);

        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");

        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.NORTH);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.EAST);
        add(b5, BorderLayout.WEST);
    }
}
