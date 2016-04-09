package q3;

/**
 * <p>
 * Book shelf is the driver of the book class.
 * This driver is going to test all the methods have been created in
 * the book class.
 * </p>
 *
 * @author TIET, KIET
 * @version 1.0
 */
public class Bookshelf {
    /**
     * <p>
     * This is the main method drives the program.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        
        // Instantiate the book objects.
        Book book1 = new Book();
        Book book2 = new Book("Java", "Pearson Education", "February, 2012");
        
        // Print out the orginal information of books.
        System.out.println("The original information of books: ");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        
        // Set infornation of book 1
        book1.setTitle("HTML Web Development");
        book1.setPublisher("ABC Education");
        book1.setCopyrightDate("January, 2016");
        
        // Set the information of book 2
        book2.setTitle("Advanced Java");
        book2.setPublisher("Pearson Education");
        book2.setCopyrightDate("February, 2014");
        System.out.println();
        
        // Print out the information of book 1
        System.out.println(book1.toString());
        System.out.println("Book's name: " + book1.getTitle());
        System.out.println("Book's publisher: " + book1.getPublisher());
        System.out.println("Book's copyright date: " 
                + book1.getCopyrightDate());
        System.out.println();
        
        // Print out the information of book 2
        System.out.println(book2.toString());
        System.out.println("Book's name: " + book2.getTitle());
        System.out.println("Book's publisher: " + book2.getPublisher());
        System.out.println("Book's copyright date: " 
                + book2.getCopyrightDate());
        System.out.println();
        System.out.println("Question three was called and ran sucessfully.");
    }

};
