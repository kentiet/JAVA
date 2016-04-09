package p2;
/**
 * 
 */
import java.util.Scanner;
/** Ideal Weight Class.
 * @author KenTiet
 * @version 1
 */
public class IdealWeight {
    
    /**Men's Weight.**/
    private static final int MEN_WEIGHT = 106;
    /**Women's Weight.**/
    private static final int WOMEN_WEIGHT = 100;
    /**for input.**/
    private static Scanner scan = new Scanner(System.in);
    
    /** Default Constructor.
     * @param args unused argument
     */
    
    public static void main(String[] args) {
       int feet; 
       int inch;
       double womenRange;
       double menRange;
       int sub;
       
       //Get the input
       System.out.println("Please enter your height value in feet and inch");
       feet = scan.nextInt();
       inch = scan.nextInt();

       //Calculation for the ideal weight
       sub = (feet - 5) * 12 + inch;
       if (inch > 0) {
          if (feet >= 5) {
             System.out.println("The ideal weight for women with the height is "
                   + feet + " feet and " + inch + " inches: "
                   + (WOMEN_WEIGHT + (sub * 5)));
             System.out.println("The ideal weight for men with the height is "
                   + feet + " feet and " + inch + " inches: "
                   + (MEN_WEIGHT + (sub * 6))); }
       else {
             System.out.println("The ideal weight for women with the height is "
                   + feet + " feet and " + inch + " inches: " + WOMEN_WEIGHT);
             System.out.println("The ideal weight for men with the height is "
               + feet + " feet and " + inch + " inches: " + MEN_WEIGHT); 
             
            }
       
       womenRange = (WOMEN_WEIGHT + (sub * 5)) * 0.15;
       menRange = (MEN_WEIGHT + (sub * 6)) * 0.15;
       
       //The range for ideal weight
       System.out.println("");
       System.out.println("The range of the ideal weight for women is from " 
                   + ((WOMEN_WEIGHT + (sub * 5)) - womenRange) 
                   + " to " + ((WOMEN_WEIGHT + (sub * 5)) + womenRange));
       
       System.out.println("The range of the ideal weight for men is from " 
                   + ((MEN_WEIGHT + (sub * 6)) - menRange) 
                   + " to " + ((MEN_WEIGHT + (sub * 6)) + menRange));

    }  
  }
}
