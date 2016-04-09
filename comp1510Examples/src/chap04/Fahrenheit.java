package chap04;

import javax.swing.JFrame;

/**
 * Demonstrates the use of text fields.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Fahrenheit {
    /**
     * Creates and displays a frame to hold the Fahrenheit panel.
     * @param args unused
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fahrenheit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FahrenheitPanel panel = new FahrenheitPanel();

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
