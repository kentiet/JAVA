package chap06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

/**
 * Demonstrates the use of conditionals and loops to guide drawing.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class BoxesPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = -975456525146002097L;

    /** Number of boxes to draw on panel. */
    private static final int NUM_BOXES = 50;

    /** Thickness of box that should be highlighted. */
    private static final int THICKNESS = 5;

    /** Maximum size of box side. */
    private static final int MAX_SIDE = 50;

    /** panel width. */
    private static final int WIDTH = 400;

    /** panel height. */
    private static final int HEIGHT = 300;

    /** source of random box sizes. */
    private final Random generator;

    /**
    * Sets up the drawing panel.
    */
    public BoxesPanel() {
        generator = new Random();

        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    /**
    * Paints boxes of random width and height in a random location.
    * Narrow or short boxes are highlighted with a fill color.
    * @param page Graphic component to use to draw
    */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        int x;
        int y;
        int width;
        int height;

        for (int count = 0; count < NUM_BOXES; count++) {
            x = generator.nextInt(WIDTH - MAX_SIDE) + 1;
            y = generator.nextInt(HEIGHT - MAX_SIDE) + 1;

            width = generator.nextInt(MAX_SIDE) + 1;
            height = generator.nextInt(MAX_SIDE) + 1;

            if (width <= THICKNESS) { // check for narrow box
                page.setColor(Color.yellow);
                page.fillRect(x, y, width, height);
            } else if (height <= THICKNESS) { // check for short box
                page.setColor(Color.green);
                page.fillRect(x, y, width, height);
            } else {
                page.setColor(Color.white);
                page.drawRect(x, y, width, height);
            }
        }
    }
}
