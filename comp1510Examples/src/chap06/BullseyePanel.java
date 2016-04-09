package chap06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Demonstrates the use of conditionals and loops to guide drawing.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class BullseyePanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 4259568145239569224L;

    /** Panel size and max width of circle. */
    private static final int MAX_WIDTH = 300;

    /** Number of rings to draw, originally 5. */
    private static final int NUM_RINGS = 5;

    /** Width of rings to draw, originally 25. */
    private static final int RING_WIDTH = MAX_WIDTH / (2 * NUM_RINGS + 2);

    /**
    * Sets up the bullseye panel.
    */
    public BullseyePanel() {
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(MAX_WIDTH, MAX_WIDTH));
    }

    /**
    * Paints a bullseye target.
    * @param page Graphics component to draw on
    */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        int x = 0;
        int y = 0;
        int diameter = MAX_WIDTH;

        page.setColor(Color.white);

        for (int count = 0; count < NUM_RINGS; count++) {
            // alternate colors
            if (page.getColor() == Color.black) {
                page.setColor(Color.white);
            } else {
                page.setColor(Color.black);
            }

            page.fillOval(x, y, diameter, diameter);

            diameter -= (2 * RING_WIDTH);
            x += RING_WIDTH;
            y += RING_WIDTH;
        }

        // Draw the red bullseye in the center
        page.setColor(Color.red);
        page.fillOval(x, y, diameter, diameter);
    }
}
