/**
 * 
 */
package q5;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * This application calculate the bonus salary based on 
 * the employee rating.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class Salary {
        
    /**
     * For currency format.
     */
    private static NumberFormat money = NumberFormat.getCurrencyInstance();
    
    /**
     * The main method that drive the program.
     * @param args command line argument
     */
    public static void main(String[] args) {
        //For input
        Scanner scan = new Scanner(System.in);
        
        //The variables for salary and reward
        double orginSalary;
        double margin;
        double newSalary;
        
        //Rating variable
        String rating;
        
        //The percentages refer to rating levels
        final double poorPercent = 0.015;
        final double goodPercent = 0.04;
        final double excellentPercent = 0.06;
        
        //Get the original salary
        System.out.println("Enter the original salary here: ");
        orginSalary = scan.nextDouble();
        
        //Get the rating
        System.out.println("Enter the employee rating "
                + "(Excellent, Good or Poor): ");
        rating = scan.next();
        
        //Calculate the condition for rewarding
        if (rating.equalsIgnoreCase("Poor")) {
            margin = orginSalary * poorPercent;
            newSalary = orginSalary + margin;
        } else {
            if (rating.equalsIgnoreCase("Good")) {
                margin = orginSalary * goodPercent;
                newSalary = orginSalary + margin;
            } else {
                margin = orginSalary * excellentPercent;
                newSalary = orginSalary + margin;
            }
        }
        
        //Print out the results
        System.out.println("The new salary is: " + money.format(newSalary));
        scan.close();
    }
}
