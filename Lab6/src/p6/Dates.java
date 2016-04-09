package p6;
import java.util.Scanner;

/**
 * Dates.java.
 * @author KenTiet
 * @version 1.0
 */
public class Dates {
    
    /**
     * The highest month can be input.
     */
    static final int MAX_MONTH = 12;
    
    /**
     * The smallest year can be input.
     */
    static final int MIN_YEAR = 1000;
    
    /**
     * The largest year can be input.
     */
    static final int MAX_YEAR = 1999;
    
    /**
     * The minimun division.
     */
    static final int MIN_DIVIDE = 4;
    
    /**
     * The maximun division.
     */
    static final int MAX_DIVIDE = 400;
    
    /**
     * The middle division.
     */
    static final int MID_DIVIDE = 400;
    
    /**
     * For input.
     */
    private static Scanner scan = new Scanner(System.in);
    

    /**
     * The main method that drives the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
         // Local variable
         int month;
         int daysInMonth;
         int year;
         boolean monthValid;
         boolean yearValid;
         boolean dayValid = false;
         boolean leapyear;
         
         System.out.println("Enter a month in number: ");
         month = scan.nextInt();
         
         System.out.println("Enter a year in number: ");
         year = scan.nextInt();
         
         System.out.println("Enter the number of days in that month: ");
         daysInMonth = scan.nextInt();
         
         // Validation for month
         if (month >= 1 && month <= MAX_MONTH) {
             monthValid = true;
             System.out.println("The month valid: " + monthValid);
         } else {
             monthValid = false;
             System.out.println("The month valid: " + monthValid);
         }
         
         
         // Validation for year
         if (year >= MIN_YEAR && year <= MAX_YEAR) {
             yearValid = true;
             System.out.println("The year valid: " + yearValid);
         } else {
             yearValid = false;
             System.out.println("The year valid: " + yearValid);
         }
         
         
         // Validation for lead year
         if (year % MIN_DIVIDE == 0 && year % MID_DIVIDE != 0 
                 || year % MAX_DIVIDE == 0) {
             leapyear = true;
             System.out.println(leapyear + " this is a leap year");
         } else {
             leapyear = false;
             System.out.println(leapyear + " this is not a leap year");
         }
         
         
         // Validation for days in month
         if (month >= 1 && month <= MAX_MONTH) {
             if (leapyear && month == 2) {
                 daysInMonth = 28;
                 System.out.println("Because this is a leap year "
                            + "so there are: " +  daysInMonth);
             } else {
                 System.out.println("The number of days in " + month 
                             + " is: " + daysInMonth);
             }
         } else {
             daysInMonth = 0;
             System.out.println("The number of days in " 
                         + month + "is: " + daysInMonth);
         }  
         
         
         // Validation for date
         if (daysInMonth == 0) {
             dayValid = false;
             System.out.println("The day valid: " + dayValid);
         } else if (daysInMonth > 0 && daysInMonth <= 31 ) {
             if (leapyear == true && daysInMonth != 29 && month == 2) {
                 dayValid = false;
                 System.out.println("The day valid: " + dayValid);
             } else {
                 dayValid = true;
                 System.out.println("The day valid: " + dayValid);
             }
         }
         
         
         if (monthValid == true && yearValid == true && dayValid == true) {
             System.out.println("Date is valid");
         } else {
             System.out.println("Date is not valid");
         }
    }

}
    
