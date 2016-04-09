package chap09;

/**
 * Demonstrates the use of the super reference.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Words2 {
    /**
    * Instantiates a derived class and invokes its inherited and
    * local methods.
    * @param args Unused
    */
    public static void main(String[] args) {
        final Dictionary2 webster = new Dictionary2(1500, 52500);

        System.out.println("Number of pages: " + webster.getPages());

        System.out
                .println("Number of definitions: " + webster.getDefinitions());

        System.out.println("Definitions per page: " + webster.computeRatio());
    }
}
