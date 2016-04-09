package chap05;

import java.util.Scanner;

/**
 * Sample program to test checkstyle's handling of else-if comb structure.
 * @author blink
 * @version 1
 *
 */
public class TestCombIf {
    
    /**base of numbers to be analyzed. */
    static final int BASE = 10;
    /**
     * read value and print number of digits using else-if.
     * @param args not used
     */
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("a = ");
        a = scan.nextInt();
        if (a < 0) {
            System.out.println("Illegal value: " + a);
        } else if (a < BASE) {
            System.out.println("one digit");
        } else if (a < BASE * BASE) {
            System.out.println("Two digits");
        } else if (a < BASE * BASE * BASE) {
            System.out.println("Three digits");
        } else {
            System.out.println("Four or more digits");
        }
        
    }

}
