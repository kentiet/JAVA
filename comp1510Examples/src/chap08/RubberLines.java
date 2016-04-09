package chap08;

import javax.swing.JFrame;

/**
 * Demonstrates mouse events and rubberbanding.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class RubberLines {
    /**
    * Creates and displays the application frame.
    * @param args Unused
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rubber Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new RubberLinesPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
