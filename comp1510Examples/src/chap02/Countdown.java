package chap02;

/**
 * Demonstrates the difference between print and println.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Countdown {
    /**
     * Prints two lines of output representing a rocket countdown.
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.print("Three... ");
        System.out.print("Two... ");
        System.out.print("One... ");
        System.out.print("Zero... ");

        System.out.println("Liftoff!"); // appears on first output line
        System.out.println("");
        System.out.println("Houston, we have a problem.");
    }
}
