package q2;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p>CylinderStats Application.</p>
 * <p>This program is going to calculate the volume and surface of the  cylinder
 * within the radius and height from the users.</p>
 *
 * @author TIET, KIET
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>The main method drives the program.</p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        
        // Variable for radius of the cylinder.
        int radius;
        // Variable for height of the cylinder.
        int height;
        // Variable for surface of the cylinder.
        double surface;
        // Variable for volume of the cylinder.
        double volume;
        
        // Create scanner object.
        Scanner scan = new Scanner(System.in);
        
        // Create the decimal format object.
        DecimalFormat fmt = new DecimalFormat("0.####");
        
        // Inputs of radius and height of the users.
        System.out.println("Enter the radius of the cylinder: ");
        radius = scan.nextInt();
        System.out.println("Enter the height of the cylinder: ");
        height = scan.nextInt();
        
        // Calculate the surface and volume.
        surface = 2 * Math.PI * radius * (radius + height);
        volume = Math.PI * Math.pow(radius, 2) * height;
        
        // Print out the result.
        System.out.println("The surface of the cylinder is: " 
                + fmt.format(surface));
        System.out.println("The volume of the cylinder is: " 
                + fmt.format(volume));
        System.out.println("Question two was called and ran sucessfully.");
        
        scan.close();
    }

};
