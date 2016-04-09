package chap08;

/**
 * Demonstrates the use of command line arguments.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class NameTag {
    /**
    * Prints a simple name tag using a greeting and a name that is
    * specified by the user.
    * @param args first string is greeting, second string is name
    */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("     " + args[0]);
        System.out.println("My name is " + args[1]);
    }
}
