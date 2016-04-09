package chap09;

/**
 * Demonstrates the use of an inherited method.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Words {
    /**
    * Instantiates a derived class and invokes its inherited and
    * local methods.
    * @param args Unused
    */
    public static void main(String[] args) {
        Dictionary webster = new Dictionary();
     //  webster.setPages(23456);
        System.out.println("Number of pages: " + webster.getPages());

        System.out
                .println("Number of definitions: " + webster.getDefinitions());

        System.out.println("Definitions per page: " + webster.computeRatio());
    }
}
