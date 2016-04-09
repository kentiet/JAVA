package chap09;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.io.File.separator;

import static java.lang.Math.abs;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Represents the primary panel for the Rebound program.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class ReboundPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 1009240907993547231L;

    /** Initial velocity increment. */
    private static final int DELTA = 10;

    /** Image to rebound off the sides of the panel. */
    private static final ImageIcon IMAGE =
              new ImageIcon("src/chap09" + separator + "happyFace.gif");

    /** Timer to used for animation sequence. */
    private Timer timer;

    /** X location of image. */
    private int x;

    /** Y location of image. */
    private int y;

    /** X distance to move image each timer increment. */
    private int moveX = DELTA;

    /** Y distance to move image each timer increment. */
    private int moveY = DELTA;

    /**
    * Sets up the panel, including the timer for the animation.
    */
    public ReboundPanel() {
        final int width = 600;
        final int height = 200;
        final int delay = 30;
        final int initialY = 40;

        timer = new Timer(delay, new ReboundListener());

        x = 0;
        y = initialY;

        setPreferredSize(new Dimension(width, height));
        setBackground(Color.black);
        timer.start();
    }

    /**
    * Draws the image in the current location.
    * @param page Graphics component to draw on
    */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        IMAGE.paintIcon(this, page, x, y);
    }

    /**
    * Represents the action listener for the timer.
    */
    private class ReboundListener implements ActionListener {
        /**
        * Updates the position of the image and possibly the direction
        * of movement whenever the timer fires an action event.
        * @param event Unused
        */
        public void actionPerformed(ActionEvent event) {
            x += moveX;
            y += moveY;

            // If x is off the panel, change velocity to bring it back
            if (x <= 0) {
                moveX = abs(moveX);
            } else if (x >= getWidth() - IMAGE.getIconWidth()) {
                moveX = -abs(moveX);
            }

            // If y is off the panel, change velocity to bring it back
            if (y <= 0) {
                moveY = abs(moveY);
            } else if (y >= getHeight() - IMAGE.getIconHeight()) {
                moveY = -abs(moveY);
            }

            repaint();
        }
    }
}
