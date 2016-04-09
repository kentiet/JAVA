package chap04;

import javax.swing.JFrame;

/**
 * Demonstrates a graphical user interface and an event listener.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class PushCounter {
    /**
     * Creates the main program frame.
     * @param args unused
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Push Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new PushCounterPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
