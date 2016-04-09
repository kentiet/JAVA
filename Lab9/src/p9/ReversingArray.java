/**
 * 
 */
package p9;

import java.util.Scanner;

/**
 * Reversing.java.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class ReversingArray {

    /**
     * Drives the programs.
     * 
     * @param args
     *            command line arguements.
     */
    public static void main(String[] args) {
        int arrayRange;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a value: ");
        arrayRange = scan.nextInt();

        int[] myArray = new int[arrayRange];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter the " + (i + 1) + " value:");
            myArray[i] = scan.nextInt();
        }

        for (int value : myArray) {
            System.out.print(value + "\t");
        }
        System.out.println();
        for (int i = 0; i < myArray.length / 2; i++) {

            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
            // System.out.print(myArray[i - 1] + "\t" );
        }

        for (int value : myArray) {
            System.out.print(value + "\t");
        }

        scan.close();

    }

}
