package chap04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Demonstrates the use of graphical objects.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class SplatPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = -796331448306561783L;
    
    /** First circle.  Arrays, covered in chapter 7 will give a more
     * reasonable way of storing several circles, and with less Javadoc
     */
    private final Circle circle1;
    /** Second circle. */
    private final Circle circle2;
    /** Third circle. */
    private final Circle circle3;
    /** Fourth circle. */
    private final Circle circle4;
    /** Fifth circle. */
    private final Circle circle5;

    /**
     * Constructor: Creates five Circle objects.
     */
    public SplatPanel() {
        //width of panel
        final int panelWidth = 600;
        //height of panel
        final int panelHeight = 400;

        //Magic numbers left in because circle definitions somewhat arbitrary
        circle1 = new Circle(60, Color.red, 140, 70);
        circle2 = new Circle(100, Color.green, 60, 40);
        circle3 = new Circle(200, Color.cyan, 120, 190);
        circle4 = new Circle(90, Color.yellow, 340, 60);
        circle5 = new Circle(120, Color.blue, 400, 120);

        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.black);
    }

    /**
     * Draws this panel by requesting that each circle draw itself.
     * @param page The graphic object upon which to draw
     */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        circle1.draw(page);
        circle2.draw(page);
        circle3.draw(page);
        circle4.draw(page);
        circle5.draw(page);
    }
}
