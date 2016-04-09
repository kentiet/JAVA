package p8;
import java.util.Scanner;

/**
 * Comparisions.java.
 * @author KenTiet
 * @version 1.0.
 */
public class Comparisions {

    /**Drives the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s1 = new String();
        String s2 = new String();
        String s3 = new String();
       
        int val1;
        int val2;
        int val3;
        
        System.out.println("Enter first strings: ");
        s1 = scan.next();
        System.out.println("Enter second strings: ");
        s2 = scan.next();
        System.out.println("Enter third strings: ");
        s3 = scan.next();
        
        System.out.println("Enter first int: ");
        val1 = scan.nextInt();
        System.out.println("Enter second int: ");
        val2 = scan.nextInt();
        System.out.println("Enter third int: ");
        val3 = scan.nextInt();
        
        
        //Compare3 compare3 = new Compare3(s1, s2, s3);
        System.out.println("The largest string is: " 
                + Compare3.largest(s1, s2, s3));
        System.out.println("The largest integer is: " 
                    + Compare3.largest(val1, val2, val3));
        scan.close();
    }

}
