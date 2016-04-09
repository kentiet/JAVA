package chap02;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

/**
 * Demonstrates basic drawing methods and the use of color.
 * Illustrates some ways of eliminating magic numbers.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Snowman extends JApplet {

    /** Unique version of this panel. */
    private static final long serialVersionUID = -904316628405194215L;

    /**
     * Draws a snowman.
     * @param page Graphics object to draw upon.
     */
    public void paint(Graphics page) {
        final int mid = 150;
        final int top = 50;

        setBackground(Color.cyan);
        page.setColor(getBackground());
        page.fillRect(0, 0, getWidth(), getHeight());
        page.setColor(getForeground());
        // ground:
        page.setColor(Color.gray);
        final int groundHeight = 50;
        page.fillRect(0, getHeight() - groundHeight, getWidth(), groundHeight);

        //sun:
        final int sunDiam = 80;
        page.setColor(Color.yellow);
        page.fillOval(-sunDiam / 2, -sunDiam / 2, sunDiam, sunDiam);

        page.setColor(Color.white);

        //head:
        final int headDiam = 40;
        page.fillOval(mid - headDiam / 2, top, headDiam, headDiam);

        //chest:
        final int chestWidth = 70;
        final int chestHeight = 50;
        final int overlap = 5;
        page.fillOval(mid - chestWidth / 2, top + headDiam - overlap, 
                chestWidth, chestHeight);

        //body:
        final int bodyWidth = 100;
        final int bodyHeight = 60;
        page.fillOval(mid - bodyWidth / 2, 
                top + headDiam + chestHeight - 2 * overlap, 
                bodyWidth, bodyHeight); // lower torso

        page.setColor(Color.black);
        final int eyeDiam = 5;
        page.fillOval(mid - 10, top + 10, 5, 5); // left eye
        page.fillOval(mid + 5, top + 10, 5, 5); // right eye

        page.drawArc(mid - 10, top + 20, 20, 10, 190, 160); // smile

        page.drawLine(mid - 25, top + 60, mid - 50, top + 40); // left arm
        page.drawLine(mid + 25, top + 60, mid + 55, top + 60); // right arm

        page.drawLine(mid - 20, top + 5, mid + 20, top + 5); // brim of hat
        page.fillRect(mid - 15, top - 20, 30, 25); // top of hat
        page.drawString("This is not a \u9b5a", 10, 100);
        page.drawString(
                "\u4f55\u6642\u8fc4\u304b \u5341\u4e5d\u5341\u4e5d\u306e"
                        + " \u767d\u62cd\u5b50", 10, 150);
    }
}
