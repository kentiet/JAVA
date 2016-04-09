package chap05;

import java.util.Random;
import java.util.Scanner;

/**
 * Demonstrates the use of a block statement in an if-else.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Guessing {
    /** Number in guessing range. */
    private static final int MAX = 10;

    /**
    * Plays a simple guessing game with the user.
    * @param args Unused
    */
    public static void main(String[] args) {
        int answer;
        int guess;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        answer = generator.nextInt(MAX) + 1;

        System.out.print("I'm thinking of a number between 1 and " + MAX
                + ". Guess what it is: ");

        guess = scan.nextInt();

        if (guess == answer) {
            System.out.println("You got it! Good guessing!");
        } else {
            System.out.println("That is not correct, sorry.");
            System.out.println("The number was " + answer);
        }
    }
}
