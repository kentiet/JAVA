package chap05;

import javax.swing.JFrame;

/**
 * Demonstrates the use of radio buttons.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class QuoteOptions {
    /**
    * Creates and presents the program frame.
    * @param args Unused
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quote Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        QuoteOptionsPanel panel = new QuoteOptionsPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
