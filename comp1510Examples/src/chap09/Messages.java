package chap09;

/**
 * Demonstrates the use of an overridden method.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Messages {
    /**
    * Creates two objects and invokes the message method in each.
    * @param args Unused
    */
    public static void main(String[] args) {
        Thought parked = new Thought();
        Advice dates = new Advice();

        parked.message();
        System.out.println("--------------");
        dates.message(); // overridden
    }
}
