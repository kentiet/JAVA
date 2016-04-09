package chap02;

/**
 *  Demonstrates the use of an assignment statement to change the
 *  value stored in a variable.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Geometry {
    /**
     * Prints the number of sides of several geometric shapes.
     * @param args unused
     */
    public static void main(String[] args) {
        int sides = 7; // declaration with initialization
        System.out.println("A heptagon has " + sides + " sides.");

        sides = 10; // assignment statement
        System.out.println("A decagon has " + sides + " sides.");

        sides = 12;
        System.out.println("A dodecagon has " + sides + " sides.");
    }
}
