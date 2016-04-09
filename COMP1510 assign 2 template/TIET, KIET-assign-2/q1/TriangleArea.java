package q1;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p>Triangle Area Application.</p>
 * <p>This program is going to calculate the area and perimeter of the triangle
 * based on three sides which need to input from users.</p>
 *
 * @author TIET, KIET
 * @version 1.0
 */
public class TriangleArea {
    /**
     * <p> The main method drives the program.</p>
     *
     * @param args  command line arguments.
     */
    public static void main(String[] args) {
        
        // Variables of three sides of the triangle.
        int side1;
        int side2;
        int side3;
        
        // Perimeter's variable.
        int perimeter;
        
        // Variable for a half of perimeter.
        double s;
        
        // Area's variable.
        double area;
        
        // Create decimal format object.
        DecimalFormat fmt = new DecimalFormat("0.###");
        
        // Create scanner object.
        Scanner scan = new Scanner(System.in);
        
        // Get input of three sides.
        System.out.println("Enter the length of side 1: ");
        side1 = scan.nextInt();
        System.out.println("Enter the length of side 2: ");
        side2 = scan.nextInt();
        System.out.println("Enter the length of side 3: ");
        side3 = scan.nextInt();
        
        // Calculate perimeter and area of the triangle.
        perimeter = side1 + side2 + side3;
        s = perimeter / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        
        // Print out the result.
        System.out.println("The perimeter of the triangle is: " 
                    + fmt.format(perimeter));
        System.out.println("The area of the triangle is: " + fmt.format(area));
        System.out.println("Question one was called and ran sucessfully.");
        scan.close();
    }

};
