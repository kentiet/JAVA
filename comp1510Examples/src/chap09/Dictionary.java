package chap09;

/**
 * Represents a dictionary, which is a book. Used to demonstrate
 * inheritance.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Dictionary extends Book {
    /** Default number of definitions. */
    private static final int DEFAULT_DEFINITIONS = 52500;
    /** Number of definitions in dictionary. */
    private int definitions = DEFAULT_DEFINITIONS;

    /**
    * Calculates value using both local and inherited values.
    * @return number of definitions per page
    */
    public double computeRatio() {
        return definitions / pages;
    }

    /**
    * Definitions mutator.
    * @param numDefinitions the new definitions to set
    */
    public void setDefinitions(int numDefinitions) {
        definitions = numDefinitions;
    }

    /**
    * Definitions accessor.
    * @return current number of definitions
    */
    public int getDefinitions() {
        return definitions;
    }
}
