package chap07;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Represents the panel in the LayoutDemo program that demonstrates the box
 * layout manager.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class BoxPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 5958016727565241916L;
    
    /** Gap between buttons 1 and 2. */
    private static final int GAP1 = 10;
    /** Gap between buttons 4 and 5. */
    private static final int GAP2 = 20;
    /**
    * Sets up this panel with some buttons to show how a vertical
    * box layout (and invisible components) affects their position.
    */
    public BoxPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        setBackground(Color.green);

        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");

        add(b1);
        add(Box.createRigidArea(new Dimension(0, GAP1)));
        add(b2);
        add(Box.createVerticalGlue());
        add(b3);
        add(b4);
        add(Box.createRigidArea(new Dimension(0, GAP2)));
        add(b5);
    }
}
