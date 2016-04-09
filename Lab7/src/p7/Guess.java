/**
 * 
 */
package p7;
import java.util.Random;
import java.util.Scanner;
/**
 * @author KenTiet
 *
 */
public class Guess {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int compNum;
        int userNum;
        boolean firstguess = true;
        
        Random generator = new Random();
        compNum = generator.nextInt(10) + 1;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number from 1 to 10: ");
        userNum = scan.nextInt();
        
        do {
            if (firstguess == false) {
                System.out.println("Enter a number again: ");
                userNum = scan.nextInt();
            }
            firstguess = false;
        } while(userNum != compNum);
        System.out.println("You're correct");
        
        
        scan.close();
        
        
     
    }

}
