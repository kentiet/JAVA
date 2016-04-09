/**
 * 
 */
package q2;

import javax.swing.JFrame;

/**
 * ColorOptions.java.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class ColorOptions {

    /**
     * Drives the program.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        JFrame colorFrame = new JFrame("Color Options");
        colorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorOptionsPanel panel = new ColorOptionsPanel();
        colorFrame.getContentPane().add(panel);
        colorFrame.pack();
        colorFrame.setVisible(true);
    }

}
