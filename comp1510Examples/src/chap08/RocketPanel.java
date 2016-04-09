package chap08;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Demonstrates the use of polygons and polylines.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class RocketPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 7321456389574250021L;

    /** X coordinates of rocket body. */
    private static final int[] X_ROCKET = {100, 120, 120, 130, 130, 70, 70, 80,
                                           80};
    /** Y coordinate of rocket body. */
    private static final int[] Y_ROCKET = {15, 40, 115, 125, 150, 150, 125,
                                           115, 40};
    /** X coordinate of rocket window. */
    private static final int[] X_WINDOW = {95, 105, 110, 90};
    /** Y coordinate of rocket window. */
    private static final int[] Y_WINDOW = {45, 45, 70, 70};

    /** X coordinate of rocket flame. */
    private static final int[] X_FLAME = {70, 70, 75, 80, 90, 100, 110, 115,
                                          120, 130, 130};
    /** Y coordinate of rocket flame. */
    private static final int[] Y_FLAME = {155, 170, 165, 190, 170, 175, 160,
                                          185, 160, 175, 155};
    /** size of panel. */
    private static final int SIZE = 200;

    /**
    * Constructor: Sets up the basic characteristics of this panel.
    */
    public RocketPanel() {
        setBackground(Color.black);
        setPreferredSize(new Dimension(SIZE, SIZE));
    }

    /**
    * Draws a rocket using polygons and polylines.
    * @param page Graphics component to draw on
    */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        page.setColor(Color.cyan);
        page.fillPolygon(X_ROCKET, Y_ROCKET, X_ROCKET.length);

        page.setColor(Color.gray);
        page.fillPolygon(X_WINDOW, Y_WINDOW, X_WINDOW.length);

        page.setColor(Color.red);
        page.drawPolyline(X_FLAME, Y_FLAME, X_FLAME.length);
    }
}
