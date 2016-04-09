/**
 * 
 */
package q5;
import java.util.Scanner;

/** This application calculates the factorials.
 * @author KenTiet
 * @version 1.0
 */
public class Factorials {

    /**
     * The main method that drivea the program.
     * @param args command line argument.
     */
    public static void main(String[] args) {
        
        //Get the input
        Scanner scan = new Scanner(System.in);
        int factor;
        int count;
        int num;
        
        //Get the number from user
        System.out.println("Enter a positive integer: ");
        num = scan.nextInt();
        
        count = 1; 
        factor = 1; 
        
        if (num < 0) {
            System.out.println("A non-negative number is required");
            System.out.println();
            System.out.println("Enter a positive integer: ");
            num = scan.nextInt();
            
            while (count <= num) {
                factor = factor * count;
                count++;
            }   
            
            System.out.println(factor);
            
        } else {    
            while (count <= num) {
                factor = factor * count;
                count++;
            }   
            System.out.println("The result is: " + factor);
            scan.close();
        }
    }

}
