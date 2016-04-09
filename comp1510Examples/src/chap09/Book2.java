package chap09;

/**
 * Represents a book. Used as the parent of a derived class to
 * demonstrate inheritance and the use of the super reference.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Book2 {
    /** Number of pages in book. */
    private int pages;

    /**
    * Constructor: Sets up the book with the specified number of
    * pages.
    * @param numPages Number of pages in book
    */
    public Book2(int numPages) {
        pages = numPages;
    }

    /**
     * Zero-parameter constructor.
     */
    public Book2() {
    }

    /**
    * Pages mutator.
    * @param numPages Number of pages in book
    */
    public void setPages(int numPages) {
        pages = numPages;
    }

    /**
    * Pages accessor.
    * @return Number of pages in book
    */
    public int getPages() {
        return pages;
    }
}
