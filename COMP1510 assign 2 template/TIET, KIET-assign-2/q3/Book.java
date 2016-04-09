/**
 * 
 */
package q3;

/**
 * <p>Book class for Bookshelf application.</p>
 * <p>Book class contains methods which can be used in the BookShelf.java.</p>
 * 
 * @author TIET, KIET
 * @version 1.0
 *
 */
public class Book {

    /**
     * Title of the book.
     */
    private String title;

    /**
     * Publisher of the book.
     */
    private String publisher;

    /**
     * The date of copyright of the book.
     */
    private String copyrightDate;

    /**
     * Default constructor.
     */
    public Book() {
        title = "";
        publisher = "";
        copyrightDate = "";
    }

    /**
     * Constructor with parameters.
     * 
     * @param title  the title of the book.
     * @param publisher  the publisher of the book.
     * @param copyrightDate  the copyright date of the book.
     */
    public Book(String title, String publisher, String copyrightDate) {
        this.title = title;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    /**
     * Set title method.
     * 
     * @param title  the title of the book which need to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set publisher method.
     * 
     * @param publisher  the publisher of the book which need to be set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Set Copyright Date method.
     * 
     * @param copyrightDate  the date of copyright need to be set
     */
    public void setCopyrightDate(String copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    /**
     * Get title method.
     * 
     * @return the title of the book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Get publisher method.
     * 
     * @return the publisher of the book
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Get copyright date method.
     * 
     * @return the date of copyright of the book
     */
    public String getCopyrightDate() {
        return this.copyrightDate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Book [title= " + title + ", publisher= " + publisher 
                + ", copyrightDate= " + copyrightDate + "]";
    }

}
