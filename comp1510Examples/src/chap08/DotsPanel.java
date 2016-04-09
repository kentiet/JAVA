package chap08;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;


/**
 * Represents the primary panel for the Dots program.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class DotsPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 1291463331398254382L;

    /** Radius of each dot. */
    private static final int SIZE = 6;

    /** Preferred panel width. */
    private static final int WIDTH = 300;

    /** Preferred panel height. */
    private static final int HEIGHT = 200;

    /** X location to draw count string. */
    private static final int X_LOC = 5;

    /** Y location to draw count string. */
    private static final int Y_LOC = 15;

    /** Centres of dots to draw. */
    private List<Point> pointList;

    /**
    * Constructor: Sets up this panel to listen for mouse events.
    */
    public DotsPanel() {
        pointList = new ArrayList<Point>();

        addMouseListener(new DotsListener());

        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    /**
    * Draws all of the dots stored in the list.
    * @param page Graphics component to draw on
    */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        page.setColor(Color.green);

        for (Point spot : pointList) {
            page.fillOval(spot.x - SIZE, spot.y - SIZE, SIZE * 2, SIZE * 2);
        }

        page.drawString("Count: " + pointList.size(), X_LOC, Y_LOC);
    }

    /**
    * Represents the listener for mouse events.
    */
    private class DotsListener implements MouseListener {
        /**
        * Adds the current point to the list of points and redraws
        * the panel whenever the mouse button is pressed.
        * @param event The event corresponding to where mouse was pressed
        */
        public void mousePressed(MouseEvent event) {
            pointList.add(event.getPoint());
            repaint();
        }

        //  Provide empty definitions for unused event methods.
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
    }
}
