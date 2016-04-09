package chap08;

import javax.swing.JFrame;

/**
 * Demonstrates key events.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Direction {
    /**
    * Creates and displays the application frame.
    * @param args Unused
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Direction");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new DirectionPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
