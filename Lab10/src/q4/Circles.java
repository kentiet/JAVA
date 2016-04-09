/**
 * 
 */
package q4;

import javax.swing.JFrame;

/**Circles.java.
 * @author KenTiet
 * @version 1.0
 */
public class Circles {

    /**Drives the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        JFrame circlesFrame = new JFrame("Circles");
        circlesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        circlesFrame.getContentPane().add(new CirclePanel());
        circlesFrame.pack();
        circlesFrame.setVisible(true);
    }

}
