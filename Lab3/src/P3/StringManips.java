/**
 * 
 */
package P3;
import java.util.Scanner;
/**
 * @author KenTiet
 *
 */
public class StringManips {
    
    public static Scanner scan = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {
        int phraseLength; //the value of the length of the string
        int middleIndex; //the value of the middle char
        String middle3; //String for 3 characters in the middle
        String firstHalf; //First half string of the phrase
        String secondHalf; // Second half string of the phrase
        String switchedPhrase;
        String phrase;
        String city; //name of the city
        String state; //name of the state
        String hometown;
        
        //Get the phrase
        System.out.println("Type a sentence here: ");
        phrase = scan.nextLine();
        System.out.println();
        
        //Get the name of city and state
        System.out.println("Type your city's name and state's name in separated lines: ");
        city = scan.nextLine();
        state = scan.nextLine();
        
        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;

        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        
        
        // concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
        
        //Change the blank char
        switchedPhrase = switchedPhrase.replace(' ', '*');
        
        //three middle characters
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
        
        //
        hometown = (city.toUpperCase()).concat((state.toLowerCase()).concat(city.toUpperCase()));
        
        
        // print information about the phrase
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength +
        " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " 
                        + phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println ("Three middle characters of the phrase are: " + middle3);
        System.out.println();
        System.out.println(hometown);
        System.out.println();
    }
    

}
