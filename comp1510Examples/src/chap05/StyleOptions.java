package chap05;

import javax.swing.JFrame;

/**
 * Demonstrates the use of check boxes.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class StyleOptions {
    /**
    * Creates and presents the program frame.
    * @param args Unused
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Style Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StyleOptionsPanel panel = new StyleOptionsPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
