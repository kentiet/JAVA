package chap02;

import java.util.Scanner;

/**
 * Demonstrates the use of the Scanner class to read numeric data.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class GasMileage {
    /**
     * Calculates fuel efficiency based on values entered by the user.
     * @param args unused
     */
    public static void main(String[] args) {
        int miles;
        double gallons;
        double mpg;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of miles: ");
        miles = scan.nextInt();

        System.out.print("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();

        mpg = miles / gallons;

        System.out.println("Miles Per Gallon: " + mpg);
    }
}
