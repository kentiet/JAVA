package q4;

import java.util.Scanner;

/**
 * <p>
 * Cylinder application calculates the volume of a cylinder within the value
 * that the users input from keyboard.
 * </p>
 *
 * @author TIET, KIET
 * @version 1.0
 */
public class Cylinder {

    /**
     * Scan object to get the input value.
     */
    private static Scanner scan = new Scanner(System.in);

    /**
     * <p>
     * This is the main method that drives the program.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Radius and height values of the cylinder
        double radius;
        double height;

        // volume of the cylinder
        double volume;

        // Get radius nd height value from user
        System.out.println("Enter the radius and height of cylinder: ");
        radius = scan.nextDouble();
        height = scan.nextDouble();

        // Calculation for volume
        volume = Math.PI * Math.pow(radius, 2) * height;

        // Print result
        System.out.println("The volume of the cylinder is : " + volume);
        System.out.println();
        System.out.println("Question four was called and ran sucessfully.");
    }

};
