package chap05;

import java.util.Scanner;

/**
 * Demonstrates the use of nested if statements.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class MinOfThree {
    /**
    * Reads three integers from the user and determines the smallest
    * value using nested if statements and a more typical method.
    * @param args Unused
    */
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int min = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 < num2) {
            if (num1 < num3) {
                min = num1;
            } else {
                min = num3;
            }
        } else if (num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        
        System.out.println("Minimum value: " + min);

        //Note this is a poor algorithm, in that it is too complex.
        //A simpler and clearer algorithm follows:

        System.out.println("Enter three integers: ");

        min = scan.nextInt();
        num2 = scan.nextInt();
        if (num2 < min) {
            min = num2;
        }
        num3 = scan.nextInt();
        if (num3 < min) {
            min = num3;
        }

        System.out.println("Minimum value: " + min);
    }
}
