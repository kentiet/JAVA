package p9;

import javax.swing.JFrame;

/**
 * Telephone.java.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class Telephone {

    /**
     * Drives the programs.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Telephone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TelephonePanel());
        frame.pack();
        frame.setVisible(true);
    }

}
