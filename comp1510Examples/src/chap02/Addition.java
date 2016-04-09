package chap02;

/**
 * Demonstrates the difference between the addition and string concatenation
 * operators.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Addition {
    /**
     * Concatenates and adds two numbers and prints the results.
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("24 and 45 concatenated: " + 24 + 45);

        System.out.println("24 and 45 added: " + (24 + 45));
    }
}
