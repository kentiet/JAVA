package chap07;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Represents the introduction panel for the LayoutDemo program.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class IntroPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = -9099206498373259820L;

    /**
     * Sets up this panel with two labels.
     */
    public IntroPanel() {
        setBackground(Color.green);

        JLabel l1 = new JLabel("Layout Manager Demonstration");
        JLabel l2 = new JLabel("Choose a tab to see an example of "
                + "a layout manager.");

        add(l1);
        add(l2);
    }
}
