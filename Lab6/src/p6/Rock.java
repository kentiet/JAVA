
package p6;
import java.util.Scanner;
import java.util.Random;

/**
 * Rock.java.
 * @author KenTiet
 * @version 1.0
 */
public class Rock {

    /**
     * The main method to drive the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        //Variable for person and computer player
        String personPlayer;
        String computerPlayer =  null;
        int compRandom;
        final int genNum = 3;
        
        // Scan object
        Scanner scan = new Scanner(System.in);
        
        // Gernate object
        Random generate = new Random();
        
        //Get input
        System.out.println("Enter R for Rock, P for Paper or S for Scissors: ");
        personPlayer = scan.next();
        
        compRandom = generate.nextInt(genNum);
        
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
        
        //Print out the computerPlayer
        System.out.println("The computer player is : " + computerPlayer);
        
        //Condition for win and lose
        if (personPlayer.equalsIgnoreCase(computerPlayer)) {
            System.out.println("It's a tie");
        } else if (personPlayer.equals("R")) {
            if (computerPlayer.equals("S")) {
                System.out.println("Rock crushes scissors, you win");
            } else {
                System.out.println("You lose");
            }
        } else if (personPlayer.equals("P")) {
            if (computerPlayer.equals("R")) {
                System.out.println("Paper wraps rock, you win");
            } else {
                System.out.println("You lose");
            }
        } else if (personPlayer.equals("S")) {
            if (computerPlayer.equals("P")) {
                System.out.println("Scissor cuts paper, you win");
            } else {
                System.out.println("You lose");
            }
        }
        scan.close();
        
        
       }

}
