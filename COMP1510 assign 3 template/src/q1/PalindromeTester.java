package q1;

import java.util.Scanner;

/**
 * <p>
 * PalindromeTester.java This program will accept the string from the user and
 * check that whether is it a palindrome or not within ignoring the spaces,
 * punctuation, and special characters.
 * </p>
 *
 * @author TIET,KIET
 * @version 1.0
 */
public class PalindromeTester {

    /**
     * <p>
     * This is the main method that drives the program.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // The phrase input by users
        String phrase = null;

        // The phrase with lower case
        String phraseLowerCase;

        // The phrase that only contain letter
        String phraseRemove;

        // The reversed phrase from the original phrase.
        String phraseReverse = "";

        // The phrase length of phraseRemove.
        int phraseLength;

        // Get input from user.
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.println("Enter a sentence");
            phrase = scan.nextLine();
            if (phrase.equals("")) {
                throw new IllegalArgumentException("The input " 
                            + "cannot be empty");
            }

            phraseLowerCase = phrase.toLowerCase();
            phraseRemove = phraseLowerCase.replaceAll("\\W", "");
            phraseLength = phraseRemove.length();

            for (int i = phraseLength - 1; i >= 0; i--) {
                phraseReverse = phraseReverse + phraseRemove.charAt(i);
            }

            if (phraseRemove.equals(phraseReverse)) {
                System.out.println("This is a palindrome.");
            } else {
                System.out.println("This is not a palindrome.");
            }
            System.out.println("Question one was called and ran sucessfully.");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        scan.close();
    }
};
