package p2;
/**
 * 
 */
import java.util.Scanner;
/**Base Conversion Class.
 * @author KenTiet
 * @version 1
 */
public class BaseConverse {
    
    /** for input */
    private static Scanner scan = new Scanner(System.in);
   
    /**Default Constructor.
     * @param args unused arguments
     */
    public static void main(String[] args) {
        int base; // the new base
        int base10Num; //thenumberinbase10 
        int maxNumber; //the maximum number that will fit
                       // in 4 digits in the new base
        int place0; // digit in the 1's (base^0) place
        int place1; // digit in the base^1 place
        int place2; // digit in the base^2 place
        int place3; // digit in the base^3 place
        
        String baseBNum = new String(""); // the number in the new base
        
        System.out.println();
        System.out.println("Base Conversion Program");
        System.out.println();
        System.out.print("Please enter a base (2-9): ");
        base = scan.nextInt();
         // Compute the maximum base 10 number that will fit in 4 digits
        // in the new base and tell the user what range the number they
        // want to convert must be in
        maxNumber = (int) Math.pow(base, 4) - 1;
        System.out.print("Please enter a base 10 number "
                    + "with the maximum number is " + maxNumber 
                    + " to convert: ");
        base10Num = scan.nextInt();
        
        //Do the calculation
        place0 = base10Num % base;
        base10Num = base10Num / base;
        
        //Now compute place1
        place1 = base10Num % base;
        base10Num = base10Num / base;
        
        
        //Repeat the idea from above to compute place2 and the next quotient
        place2 = base10Num % base;
        base10Num = base10Num / base;
        
        //Repeat again to compute place3
        place3 = base10Num % base;
        base10Num = base10Num / base;
        
        //Print the result
        baseBNum = (place3 + "" + place2 + "" + place1 + "" + place0);
        System.out.println(baseBNum);
    }

}
