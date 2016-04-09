package chap08;

import javax.swing.JFrame;

/**
 * Demonstrates mouse events.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Dots {
    /**
    * Creates and displays the application frame.
    * @param args Unused
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dots");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new DotsPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
