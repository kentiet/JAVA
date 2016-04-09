package chap05;

import javax.swing.JFrame;

/**
 * Demonstrates the use of one listener for multiple buttons.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class LeftRight {
    /**
    * Creates the main program frame.
    * @param args Unused
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Left Right");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new LeftRightPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
