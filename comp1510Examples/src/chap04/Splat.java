package chap04;

import javax.swing.JFrame;

/**
 * Draws a panel with circles using graphical objects that draw themselves.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Splat {
    /**
     * Presents a collection of circles.
     * @param args unused
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Splat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new SplatPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
