package q2;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>
 * RockPaperScissor.java.
 * This program will get the input (Rock, Paper or Scissors) from
 * the user compare to computer cases to determine the winner and looser.
 * </p>
 *
 * @author TIET, KIET
 * @version 1.0
 */
public class RockPaperScissors {

    /**
     * The random play from computer.
     */
    private static String computerPlayer;

    /**
     * The play that input from the user.
     */
    private static String personPlayer;

    /**
     * The case that computer generates.
     */
    private static int compRandom;

    /**
     * The limitation of the integer that computer can generate.
     */
    private static final int GEN_NUM = 3;

    /**
     * The number of times that user wins.
     */
    private static int personWin;

    /**
     * The numnber of time that user loses.
     */
    private static int personLoose;

    /**
     * The number of times that user and computer make a tie.
     */
    private static int personTie;

    /**
     * <p>
     * This is the main method that drives the program.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        
        // String for stopping program.
        String terminate;

        // Scan object
        Scanner scan = new Scanner(System.in);
        
        do {
            try {
                RockPaperScissors.getInput();
                if (!personPlayer.equalsIgnoreCase("R") 
                        && !personPlayer.equalsIgnoreCase("S") 
                        && !personPlayer.equalsIgnoreCase("P")) {
                    throw new IllegalArgumentException("The input cannot "
                            + "be empty and must be \"R\", \"S\" or \"P\"");
                }
            RockPaperScissors.randComp();

            // Print out the computerPlayer
            System.out.println("The computer player is : " + computerPlayer);

            RockPaperScissors.playerCompare();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            System.out.println("Do you want to continue(y/n)");
            terminate = scan.next();
        } while (terminate.equals("y"));

        System.out.println("Times you win: " + personWin);
        System.out.println("Times you loose: " + personLoose);
        System.out.println("Times you ties: " + personTie);

        System.out.println("Question two was called and ran sucessfully.");

        scan.close();
    }

    /**
     * Generate the cases of the computer players.
     */
    public static void randComp() {
        Random generate = new Random();
        compRandom = generate.nextInt(GEN_NUM);

        switch (compRandom) {
        case 0:
            computerPlayer = "R";
            break;
        case 1:
            computerPlayer = "P";
            break;
        case 2:
            computerPlayer = "S";
            break;
        default:
            computerPlayer = "Don't play";
            break;
        }
    }
    
    /**
     * Get the input from user.
     * @return user's input
     */
    public static String getInput() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter R for Rock, " 
                    + "P for Paper or S for Scissors: ");
            personPlayer = scan.nextLine();
        return personPlayer;
    }

    /**
     * Compare the input from user and the case from computer.
     */
    public static void playerCompare() {
        if (personPlayer.equalsIgnoreCase(computerPlayer)) {
            System.out.println("It's a tie");
            personTie++;
        } else if (personPlayer.equalsIgnoreCase("R")) {
            if (computerPlayer.equalsIgnoreCase("S")) {
                System.out.println("Rock crushes scissors, you win");
                personWin++;
            } else {
                System.out.println("You lose");
                personLoose++;
            }
        } else if (personPlayer.equalsIgnoreCase("P")) {
            if (computerPlayer.equalsIgnoreCase("R")) {
                System.out.println("Paper wraps rock, you win");
                personWin++;
            } else {
                System.out.println("You lose");
                personLoose++;
            }
        } else if (personPlayer.equalsIgnoreCase("S")) {
            if (computerPlayer.equalsIgnoreCase("P")) {
                System.out.println("Scissor cuts paper, you win");
                personWin++;
            } else {
                System.out.println("You lose");
                personLoose++;
            }
        }

    }
  
}
