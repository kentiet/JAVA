package chap10;

/**
 * Demonstrates polymorphism via inheritance.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Firm {
    /**
    * Creates a staff of employees for a firm and pays them.
    * @param args Unused
    */
    public static void main(String[] args) {
        Staff personnel = new Staff();

        personnel.payday();
    }
}
