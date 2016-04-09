/**
 * 
 */
package p4;

import java.util.Scanner;

/**
 * <p>
 * Distance application is used for calculating the distance between two poins
 * The value of two points will be input by users with scanner class.
 * </p>
 * 
 * @author KenTiet
 * @version 1.0
 */
public class Distance {

    /**
     * For input.
     */
    private static Scanner scan = new Scanner(System.in);

    /**
     * The main method used to drive the program.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {

        // coordinates of two points
        double x1;
        double y1;
        double x2;
        double y2;

        // distance between the points
        double distance;

        // Read in the two points
        System.out.print("Enter the coordinates of the first point " 
                    + "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.print("Enter the coordinates of the second point " 
                    + "(put a space between them): ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        // Compute the distance
        distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        // Print out the answer
        System.out.println("The distance between is: " + distance);
    }

}
