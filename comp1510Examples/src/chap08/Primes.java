package chap08;

/**
 * Demonstrates the use of an initializer list for an array.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Primes {
    /** first several prime numbers. */
    private static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

    /**
    * Stores some prime numbers in an array and prints them.
    * @param args Unused
    */
    public static void main(String[] args) {

        System.out.println("Array length: " + PRIMES.length);

        System.out.println("The first few prime numbers are:");

        for (int prime : PRIMES) {
            System.out.print(prime + "  ");
        }
    }
}
