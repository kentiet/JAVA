package chap08;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.io.File.separator;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Represents the primary display panel for the Direction program.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class DirectionPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = -8488309313313664194L;

    /** Preferred panel width. */
    private static final int WIDTH = 300;

    /** Preferred panel height. */
    private static final int HEIGHT = 200;

    /** increment for image movement. */
    private static final int JUMP = 10;

    /** Holds icon for up arrow. */
    private static final ImageIcon UP = 
        new ImageIcon("chap08" + separator + "arrowUp.gif");

    /** Holds icon for down arrow. */
    private static final ImageIcon DOWN = 
        new ImageIcon("chap08" + separator + "arrowDown.gif");

    /** Holds icon for right arrow. */
    private static final ImageIcon RIGHT = 
        new ImageIcon("chap08" + separator + "arrowRight.gif");

    /** Holds icon for left arrow. */
    private static final ImageIcon LEFT = 
        new ImageIcon("chap08" + separator + "arrowLeft.gif");

    /** Holds icon corresponding to last arrow press. */
    private ImageIcon currentImage;

    /** Holds x location of current image. */
    private int x;

    /** Holds y location of current image. */
    private int y;

    /**
    * Constructor: Sets up this panel and loads the images.
    */
    public DirectionPanel() {
        addKeyListener(new DirectionListener());

        x = WIDTH / 2;
        y = HEIGHT / 2;

        currentImage = RIGHT;

        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
    }

    /**
    * Draws the image in the current location.
    * @param page Graphics component to draw on
    */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        currentImage.paintIcon(this, page, x, y);
    }

    /**
    * Represents the listener for keyboard activity.
    */
    private class DirectionListener implements KeyListener {
        /**
        * Responds to the user pressing arrow keys by adjusting the
        * image and image location accordingly.
        * @param event The event corresponding to the key press
        */
        public void keyPressed(KeyEvent event) {
            switch (event.getKeyCode()) {
                case KeyEvent.VK_UP:
                    currentImage = UP;
                    y -= JUMP;
                    break;
                case KeyEvent.VK_DOWN:
                    currentImage = DOWN;
                    y += JUMP;
                    break;
                case KeyEvent.VK_LEFT:
                    currentImage = LEFT;
                    x -= JUMP;
                    break;
                case KeyEvent.VK_RIGHT:
                    currentImage = RIGHT;
                    x += JUMP;
                    break;
                default:
                    // ignore other characters
            }

            repaint();
        }


        // Provide empty definitions for unused event methods.

        /** {@inheritDoc} */
        public void keyTyped(KeyEvent event) {
        }

        /** {@inheritDoc} */
        public void keyReleased(KeyEvent event) {
        }
    }
}
