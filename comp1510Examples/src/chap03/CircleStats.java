package chap03;

import java.util.Scanner;
import java.text.DecimalFormat;
/** 
*
* Demonstrates the formatting of decimal values using the DecimalFormat class.
* @author Lewis/Loftus
* @version 1.0
*/
public class CircleStats {
    /**
    * Calculates the area and circumference of a circle given its
    * radius.
    * @param args not used
    */
    public static void main(String[] args) {
        double radius;
        double area;
        double circumference;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the circle's radius: ");
        radius = scan.nextDouble();

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        // Round the output to three decimal places
        DecimalFormat fmt = new DecimalFormat("#.###");

        System.out.println("The circle's area: " + fmt.format(area));
        System.out.println("The circle's circumference: "
                + fmt.format(circumference));
    }
}
