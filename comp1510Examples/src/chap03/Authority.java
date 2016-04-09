package chap03;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates the use of frames, panels, and labels.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Authority {
    /**
     * Displays some words of wisdom.
     * @param args unused
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Authority");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel primary = new JPanel();
        primary.setBackground(Color.yellow);
        final int width = 250;
        final int height = 75;
        primary.setPreferredSize(new Dimension(width, height));

        JLabel label1 = new JLabel("Question authority,");
        JLabel label2 = new JLabel("but raise your hand first.");

        primary.add(label1);
        primary.add(label2);

        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }
}

