package chap02;

import java.util.Scanner;

/**
 *  Demonstrates the use of the nextLine method of the Scanner class
 *  to read a string from the user.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Echo {
    /**
     * Reads a character string from the user and prints it.
     * @param args unused
     */
    public static void main(String[] args) {
        String message;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a line of text:");

        message = scan.nextLine();

        System.out.println("You entered: \"" + message + "\"");
    }
}
