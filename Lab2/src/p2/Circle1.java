package p2;
/**
 * 
 */
import java.util.Scanner;
/**Circle1 Class.
 * @author KenTiet
 * @version 1
 */
public class Circle1 {
    
    /** Constant PI. */
    public static final double PI = 3.14159;
    
    /**To get the input. */
    private static Scanner scan = new Scanner(System.in);
    
    /**Default Constructor.
     * @param args unused
     */
    public static void main(String[] args) {
        int radius;
        double area1;
        double circumference1;
        double circumference2;
        
        //Get Input
        System.out.println("Please enter a value for radius ");
        radius = scan.nextInt();
        
        //Calculation for circumference1
        area1 = PI * radius * radius;
        circumference1 = 2 * PI * radius;
         System.out.println("The area of a circle with radius " + radius 
                 + " is " + area1);
         System.out.println("The circumference of a circle with radius " 
                         + radius + " is " + circumference1);
        
        double area2 = PI * radius * radius;
         System.out.println("The area of a circle with radius " + radius 
                 + " is " + area2);
         circumference2 = 2 * PI * radius;
         System.out.println("The circumference of a circle with radius " 
                         + radius + " is " + circumference2);
         
         double areaDiffer = area2 / area1;
         System.out.println("The difference betweem area 1 and area 2 is: " 
                     + areaDiffer);
         
         double circumDiffer = circumference2 / circumference1;
         System.out.println("The difference between the circumference 1 " 
                 + "and circumference 2 is: " + circumDiffer);
    }

}
