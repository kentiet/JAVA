package chap04;

import javax.swing.JFrame;

/**
 * Demonstrates the use of a separate panel class.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class SmilingFace {
    /**
     * Creates the main frame of the program.
     * @param args unused
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiling Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SmilingFacePanel panel = new SmilingFacePanel();

        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
