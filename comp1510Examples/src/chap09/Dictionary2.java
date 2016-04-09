package chap09;

/**
 * Represents a dictionary, which is a book. Used to demonstrate
 * the use of the super reference.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Dictionary2 extends Book2 {
    /** Holds number of definition for dictionary. */
    private int definitions;

    /**
    * Constructor: Sets up the dictionary with the specified number
    * of pages and definitions.
    * @param numPages number of pages for the dictionary
    * @param numDefinitions number of definitions in the dictionary
    */
    public Dictionary2(int numPages, int numDefinitions) {
        super(numPages);
        //setPages(numPages);
        definitions = numDefinitions;
    }

    /**
    * Calculates a value using both local and inherited values.
    * @return number of definitions per page
    */
    public double computeRatio() {
        return definitions / getPages();
    }

    /**
    * Definitions mutator.
    * @param numDefinitions number of definitions to set
    */
    public void setDefinitions(int numDefinitions) {
        definitions = numDefinitions;
    }

    /**
    * Definitions accessor.
    * @return number of definitions in dictionary
    */
    public int getDefinitions() {
        return definitions;
    }

}
