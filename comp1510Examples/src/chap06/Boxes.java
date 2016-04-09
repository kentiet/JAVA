package chap06;

import javax.swing.JFrame;


/**
 * Demonstrates the use of loops to draw.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Boxes {
    /**
    * Creates the main frame of the program.
    * @param args Unused
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Boxes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BoxesPanel panel = new BoxesPanel();

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
