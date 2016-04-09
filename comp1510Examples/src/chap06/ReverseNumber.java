package chap06;

import java.util.Scanner;

/**
 * Demonstrates the use of a do loop.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class ReverseNumber {
    /**
    * Reverses the digits of an integer mathematically.
    * @param args Unused
    */
    public static void main(String[] args) {
        int number;
        int lastDigit;
        int reverse = 0;
        final int base = 10;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        number = scan.nextInt();

        do {
            lastDigit = number % base;
            reverse = (reverse * base) + lastDigit;
            number = number / base;
        } while (number > 0);

        System.out.println("That number reversed is " + reverse);
    }
}
