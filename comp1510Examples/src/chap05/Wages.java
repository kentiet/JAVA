package chap05;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Demonstrates the use of an if-else statement.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Wages {
    /**
    * Reads the number of hours worked and calculates wages.
    * @param args Unused
    */
    public static void main(String[] args) {
        final double rate = 8.25; // regular pay rate
        final double overtimeRate = rate * 1.5;
        final int standard = 40; // standard hours in a work week

        Scanner scan = new Scanner(System.in);

        double pay = 0.0;

        System.out.print("Enter the number of hours worked: ");
        int hours = scan.nextInt();

        System.out.println();

        // Pay overtime at "time and a half"
        if (hours > standard) {
            pay = standard * rate + (hours - standard) * overtimeRate;
        } else {
            pay = hours * rate;
        }
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Gross earnings: " + fmt.format(pay));
    }
}
