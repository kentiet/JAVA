package chap08;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;


/**
 * Represents the primary drawing panel for the RubberLines program.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class RubberLinesPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 7261353353262965117L;
    
    /** Panel height. */
    private static final int HEIGHT = 200;
    /** Panel width. */
    private static final int WIDTH = 400;

    /** First point to draw line. */
    private Point point1;
    /** Second point to draw line. */
    private Point point2;

    /**
    * Constructor: Sets up this panel to listen for mouse events.
    */
    public RubberLinesPanel() {
        LineListener listener = new LineListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);

        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    /**
    * Draws the current line from the intial mouse-pressed point to
    * the current position of the mouse.
    * @param page Graphics component to draw on
    */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        page.setColor(Color.yellow);
        if (point1 != null && point2 != null) {
            page.drawLine(point1.x, point1.y, point2.x, point2.y);
        }
    }

    /**
    * Represents the listener for all mouse events.
    */
    private class LineListener implements MouseListener, MouseMotionListener {
        /**
        * Captures the initial position at which the mouse button is
        * pressed.
        * @param event Contains position of mouse press
        */
        public void mousePressed(MouseEvent event) {
            point1 = event.getPoint();
        }

        /**
        * Gets the current position of the mouse as it is dragged and
        * redraws the line to create the rubberband effect.
        * @param event Contains position where mouse is released
        */
        public void mouseDragged(MouseEvent event) {
            point2 = event.getPoint();
            repaint();
        }


        // Provide empty definitions for unused event methods.

        /** {@inheritDoc} */
        public void mouseClicked(MouseEvent event) {
        }
        /** {@inheritDoc} */
        public void mouseReleased(MouseEvent event) {
        }
        /** {@inheritDoc} */
        public void mouseEntered(MouseEvent event) {
        }
        /** {@inheritDoc} */
        public void mouseExited(MouseEvent event) {
        }
        /** {@inheritDoc} */
        public void mouseMoved(MouseEvent event) {
        }
    }
}
