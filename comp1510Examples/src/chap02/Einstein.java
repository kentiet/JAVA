package chap02;

import javax.swing.JApplet;
import java.awt.Graphics;

/**
 * Demonstrates a basic applet.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Einstein extends JApplet {
    /** Unique version of this panel. */
    private static final long serialVersionUID = -2086197111464014467L;

    /**
     * Draws a quotation by Albert Einstein among some shapes.
     * @param page Graphics object to draw upon
     */
    public void paint(Graphics page) {
        page.drawRect(50, 50, 40, 40); // square
        page.drawRect(60, 80, 225, 30); // rectangle
        page.drawOval(75, 65, 20, 20); // circle
        page.drawLine(35, 60, 100, 120); // line

        page.drawString("Out of clutter, find simplicity.", 110, 70);
        page.drawString("-- Albert Einstein", 130, 100);
        page.drawString("What is this? \u0427\u0442\u043e "
                + "\u044d\u0442\u043e \u0442\u0430\u043a\u043e\u0451?", 110,
                130);
    }
}
