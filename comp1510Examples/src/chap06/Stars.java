package chap06;

/**
 * Demonstrates the use of nested for loops.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Stars {
    /**
    * Prints a triangle shape using asterisk (star) characters.
    * @param args Unused
    */
    public static void main(String[] args) {
        final int maxRows = 10;

        for (int row = 1; row <= maxRows; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
