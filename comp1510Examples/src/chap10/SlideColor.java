package chap10;

import javax.swing.JFrame;

/**
 * Demonstrates the use slider components.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class SlideColor {
    /**
    * Presents up a frame with a control panel and a panel that
    * changes color as the sliders are adjusted.
    * @param args Unused
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Slide Colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new SlideColorPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
