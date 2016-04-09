/**
 * 
 */
package q3;

import javax.swing.JFrame;

/**
 * @author KenTiet
 *
 */
public class Rebound {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rebound");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ReboundPanel());
        frame.pack();
        frame.setVisible(true);
    }

}
