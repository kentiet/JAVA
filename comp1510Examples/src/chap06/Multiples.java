package chap06;

import java.util.Scanner;

/**
 *  Demonstrates the use of a for loop.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Multiples {
    /**
    * Prints multiples of a user-specified number up to a user-
    * specified limit.
    * @param args Unused
    */
    public static void main(String[] args) {
        /** Number of values to print per line. */
        final int perLine = 5;

        /** Prints multiples of value. */
        final int value;

        /** prints up to limit. */
        final int limit;

        /** line counter so can advance to new line after perLine lines */
        int count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive value: ");
        value = scan.nextInt();

        System.out.print("Enter an upper limit: ");
        limit = scan.nextInt();

        System.out.println();
        System.out.println("The multiples of " + value + " between " + value
                + " and " + limit + " (inclusive) are:");

        for (int mult = value; mult <= limit; mult += value) {
            System.out.print(mult + "\t");

            // Print a specific number of values per line of output
            count++;
            if (count % perLine == 0) {
                System.out.println();
            }
        }
    }
}
