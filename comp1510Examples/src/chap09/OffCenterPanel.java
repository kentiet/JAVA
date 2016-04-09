package chap09;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JPanel;

/**
 * Represents the primary drawing panel for the OffCenter program.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class OffCenterPanel extends JPanel {

    /** Unique version of this panel. */
    private static final long serialVersionUID = -49732649670363L;

    /** Formatter for length. */
    private static final DecimalFormat FMT = new DecimalFormat("0.##");

    /** Position of mouse cursor when mouse clicked. */
    private Point current;

    /** X coordinate of window center when window first drawn. */
    private int centerX;

    /** Y coordinate of window center when window first drawn. */
    private int centerY;

    /** Length of line between screen center and mouse click. */
    private double length;

    /**
    * Constructor: Sets up the panel and necessary data.
    */
    public OffCenterPanel() {
        final int width = 300;
        final int height = 300;
        addMouseListener(new OffCenterListener());

        centerX = width / 2;
        centerY = height / 2;

        setPreferredSize(new Dimension(width, height));
        setBackground(Color.yellow);
    }

    /**
    * Draws a line from the mouse pointer to the center point of
    * the screen and displays the distance.
    * @param page Graphics component to draw on
    */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        // radius of circle at screen center
        final int radius = 3;

        // Location to write "Distance" string
        final int textX = 10;
        final int textY = 15;
        page.setColor(Color.black);
        page.drawOval(centerX - radius, centerY - radius, radius * 2,
                radius * 2);

        if (current != null) {
            page.drawLine(current.x, current.y, centerX, centerY);
            page.drawString("Distance: " + FMT.format(length), textX, textY);
        }
    }

    /**
    * Represents the listener for mouse events. Demonstrates the
    * ability to extend an adaptor class.
    */
    private class OffCenterListener extends MouseAdapter {
        /**
        * Computes the distance from the mouse pointer to the center
        * point of the applet.
        * @param event Provides coordinates of mouse when clicked
        */
        public void mouseClicked(MouseEvent event) {
            current = event.getPoint();
            length = Math.sqrt(Math.pow((current.x - centerX), 2)
                    + Math.pow((current.y - centerY), 2));
            repaint();
        }
    }
}
