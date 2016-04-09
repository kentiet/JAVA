package p2;
/**
 * 
 */

/** Circle class.
 * @author KenTiet
 * @version 1
 */
public class Circle {

    /** Constant PI. */
     public static final double PI = 3.14159;
     
    /** Default Constructor.
     * @param args unused
     */
    public static void main(String[] args) {
        
        int radius = 10;
        double area1 = PI * radius * radius;
        double circumference1 = 2 * PI * radius;
        double circumference2;
         System.out.println("The area of a circle with radius " + radius 
                 + " is " + area1);
         System.out.println("The circumference of a circle with radius " 
                         + radius + " is " + circumference1);
         System.out.println("");
        radius = 20;
        double area2 = PI * radius * radius;
         System.out.println("The area of a circle with radius " + radius 
                     + " is " + area2);
         circumference2 = 2 * PI * radius;
         System.out.println("The circumference of a circle with radius " 
                     + radius + " is " + circumference2);
         System.out.println("");
         
         double areaDiffer = area2 / area1;
         System.out.println("The difference betweem area 1 and area 2 is: " 
                     + areaDiffer);
         
         double circumDiffer = circumference2 / circumference1;
         System.out.println("The difference between the circumference 1 " 
                     + "and circumference 2 is: " + circumDiffer);
         
    }

}
