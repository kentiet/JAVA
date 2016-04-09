package chap09;

import javax.swing.JFrame;

/**
 * Demonstrates the use of an event adapter class.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class OffCenter {
    /**
    * Creates the main frame of the program.
    * @param args Unused
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Off Center");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new OffCenterPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
