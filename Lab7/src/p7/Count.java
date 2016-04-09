/**
 * 
 */
package p7;
import java.util.Scanner;
/**
 * Count.java.
 * @author KenTiet
 * @version 1.0
 */
public class Count {

    /**Drives the programs.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phrase;
        char ch;
        int countA = 0;
        int countE = 0;
        int countS = 0;
        int countT = 0;
        int countBlank = 0;
        String quit;
        
        do {
            System.out.println("Enter a phrase: ");
            phrase = scan.nextLine();
            countA = 0;
            countE = 0;
            countS = 0;
            countT = 0;
            countBlank = 0;
        for (int i = 0; i < phrase.length(); i++) {
            ch = phrase.charAt(i);
            switch (ch) {
            case 'a':
            case 'A':
                countA++;
                break;
            case 'e': 
            case 'E':    
                countE++;
                break;
            case 's':
            case 'S':     
                countS++;
                break;
            case 't':
            case 'T':     
                countT++;
                break;
            case ' ': 
                countBlank++;
                break;
            }
        }
        System.out.println("Character A: " + countA);
        System.out.println("Character E: " + countE);
        System.out.println("Character S: " + countS);
        System.out.println("Character T: " + countT);
        System.out.println("Numbers of spaces: " + countBlank);
        System.out.println("Continue? (Exit to quit)");
        quit = scan.next();
        } while (!quit.equals("exit"));
        scan.close();
        
        
    }

}
