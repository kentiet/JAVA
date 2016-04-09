package chap03;

import java.awt.Color;
import java.awt.Dimension;

import static java.io.File.separator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Demonstrates the use of image icons in labels.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class LabelDemo {
    /**
     * Creates and displays the primary application frame.
     * @param args unused
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("chap03" + separator + "devil.gif");

        JLabel label1;
        JLabel label2;
        JLabel label3;

        label1 = new JLabel("Devil Left", icon, SwingConstants.CENTER);

        label2 = new JLabel("Devil Right", icon, SwingConstants.CENTER);
        label2.setHorizontalTextPosition(SwingConstants.LEFT);
        label2.setVerticalTextPosition(SwingConstants.BOTTOM);

        label3 = new JLabel("Devil Above", icon, SwingConstants.CENTER);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);

        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        
        final int width = 200;
        final int height = 250;
        panel.setPreferredSize(new Dimension(width, height));
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
