package chap07;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Represents the panel in the LayoutDemo program that demonstrates
 * the grid layout manager.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class GridPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = -5098134601065734150L;
    
    /** Number of rows in panel. */
    private static final int ROWS = 2;
    /** Number of columns in panel. */
    private static final int COLS = 3;
    /**
     * Sets up this panel with some buttons to show how grid
     * layout affects their position, shape, and size.
     */
    public GridPanel() {
        setLayout(new GridLayout(ROWS, COLS));

        setBackground(Color.green);

        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
}
