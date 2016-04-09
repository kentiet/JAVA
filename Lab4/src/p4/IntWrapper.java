/**
 * 
 */
package p4;

import java.util.Scanner;

/**
 * <p>
 * The IntWrapper application is used to transform two integers from the users
 * to binary, octal, and hexadecimal form at the same time.
 * </p>
 * 
 * @author KenTiet
 * @version 1.0
 */
public class IntWrapper {
    /**
     * Get the input value.
     */
    private static Scanner scan = new Scanner(System.in);

    /**
     * The minimum value of the integer.
     */
    private static int minValue = Integer.MIN_VALUE;

    /**
     * The maximum value of the integer.
     */
    private static int maxValue = Integer.MAX_VALUE;

    /**
     * The main method that drives the program.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        // Two integers variable
        int num1;
        int num2;
        int num3;
        // Two strings variable hold the integer values
        String str1;
        String str2;
        String str3;
        // String variable for binary
        String strBin1;
        // String variable for octal
        String strOct1;

        // String variable for hex
        String strHex1;

        // Get value from users
        System.out.println("Enter an integer here: ");
        str1 = scan.nextLine();

        System.out.println("Enter two integers in separated lines: ");
        str2 = scan.nextLine();
        str3 = scan.nextLine();

        // Convert two strings into integer values
        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);
        num3 = Integer.parseInt(str3);

        // Conversion method from wrapper class
        strBin1 = Integer.toBinaryString(num1);
        strOct1 = Integer.toOctalString(num1);
        strHex1 = Integer.toHexString(num1);
        /*
         * strBin1 = Integer.toBinaryString(num1); strOct1 =
         * Integer.toOctalString(num1); strHex1 = Integer.toHexString(num1);
         * strBin2 = Integer.toBinaryString(num2); strOct2 =
         * Integer.toOctalString(num2); strHex2 = Integer.toHexString(num2);
         */

        // Print out the min and max values
        System.out.println("The minimum value of the ineger: " + minValue);
        System.out.println("The maximun value of the ineger: " + maxValue);
        System.out.println();

        // Print out the conversion result of number one
        System.out.println(strBin1);
        System.out.println(strOct1);
        System.out.println(strHex1.toUpperCase());
        System.out.println();

        /*
         * System.out.println(strBin3); System.out.println(strOct3);
         * System.out.println(strHex3.toUpperCase()); // Print out the
         * conversion result of number two System.out.println(strBin2);
         * System.out.println(strOct2);
         * System.out.println(strHex2.toUpperCase()); System.out.println();
         */

        // The adding result
        System.out.println("The sum of two integers: " + (num2 + num3));

    }

}
