package chap08;

import java.util.Scanner;

/**
 * Demonstrates array index processing.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class ReverseOrder {
    /** How many numbers to read. */
    private static final int TO_READ = 10;

    /**
    * Reads a list of numbers from the user, storing them in an
    * array, then prints them in the opposite order.
    * @param args Unused
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Could read TO_READ from user rather than using constant
        double[] numbers = new double[TO_READ];
        //numbers = new double[5];

        System.out.println("The size of the array: " + numbers.length);

        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            numbers[index] = scan.nextDouble();
        }

        System.out.println("The numbers in reverse order:");

        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.print(numbers[index] + "  ");
        }
    }
}
