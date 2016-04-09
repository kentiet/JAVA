/**
 * 
 */
package p4;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;


/**
 * <p>
 * Deli is the application which calculate the price based on the weight The
 * value of weight will be got form scanner class. The result will be format
 * base on the currency format and the weight base on the decimal format with
 * two digits in the fraction part.
 * </p>
 * 
 * @author KenTiet
 * @version 1.0
 */
public class Deli {

    /**
     * Input the value.
     */
    private static Scanner scan = new Scanner(System.in);

    /**
     * The amount of ounces per pound.
     */
    private static final double OUNCES_PER_POUND = 16.0;
    
    /**
     * Currency format.
     */
    private static NumberFormat money = NumberFormat.getCurrencyInstance();
    
    /**
     * Decimal format.
     */
    private static DecimalFormat fmt = new DecimalFormat("0.##");
    
    /**
     * The price per pound value.
     */
    private static final double PRICE_PER_POUND = 4.25;
    /**
     * The main method which drive the program.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {

        // weight in ounces
        double weightOunces;
        double pricePerPound;
        // weight in pounds
        double weight;
        
        // total price for the item
        double totalPrice;  

        // Read in each input
        System.out.println("Welcome to the CS Deli! ! \n ");
        System.out.print("Enter the price: ");
        pricePerPound = scan.nextDouble();
        System.out.print("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        // Convert ounces to pounds and compute the total price
        weight = weightOunces / pricePerPound;
        totalPrice = pricePerPound * weight;

        // Print the label using the formatting objects
        System.out.println("**** CSDeli *****");
        System.out.println();
        System.out.println("Unite Price: " + money.format(pricePerPound));
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println();
        System.out.println("TOTAL: " + money.format(totalPrice));
    }
}
