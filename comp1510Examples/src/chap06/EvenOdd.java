package chap06;

import javax.swing.JOptionPane;

/**
 * Demonstrates the use of the JOptionPane class.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class EvenOdd {
    /**
    * Determines if the value input by the user is even or odd.
    * Uses multiple dialog boxes for user interaction.
    * @param args Unused
    */
    public static void main(String[] args) {
        String numStr;
        String result;
        int num;
        int again;

        do {
            numStr = JOptionPane.showInputDialog("Enter an integer: ");

            num = Integer.parseInt(numStr);

            result = "That number is " + ((num % 2 == 0) ? "even" : "odd");

            JOptionPane.showMessageDialog(null, result);

            again = JOptionPane.showConfirmDialog(null, "Do Another?");
        } while (again == JOptionPane.YES_OPTION);
    }
}
