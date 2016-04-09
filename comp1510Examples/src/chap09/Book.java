package chap09;

/**
 * Represents a book. Used as the parent of a derived class to
 * demonstrate inheritance.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Book {
    /** Default number of pages. */
    private static final int DEFAULT_PAGES = 1500;

    /** number of pages in book.
     * Should be private but illustrating how protected works.
     * Violation of Checkstyle.
     */
    protected int pages = DEFAULT_PAGES;

    /**
    * Pages mutator.
    * @param numPages New value of pages
    */
    public void setPages(int numPages) {
        pages = numPages;
    }

    /**
    * Pages accessor.
    * @return pages
    */
    public int getPages() {
        return pages;
    }


}
