package chap05;

import java.util.Scanner;

/**
 * Demonstrates the use of an if statement.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Age {
    /** Age of majority.  Person is minor if age < MINOR */
    public static final int MINOR = 21;
    /**
    * Reads the user's age and prints comments accordingly.
    * @param args Unused
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("You entered: " + age);

        if (age < MINOR) {
            System.out.println("Youth is a wonderful thing. Enjoy.");
        }

        System.out.println("Age is a state of mind.");
    }
}
