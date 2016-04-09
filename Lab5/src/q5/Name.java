/**
 * 
 */
package q5;
import java.util.Scanner;

/**
 * Name class.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class Name {
    
    /**
     * Scanner to get input.
     */
    private Scanner scan;
    /**
     * First Name of the users.
     */
    private String first;
    
    /**
     * Initial Name of the users.
     */
    private String middle;
    
    /**
     * Last Name of the users.
     */
    private String last;
    
    /**
     * Boolean value.
     */
    private boolean compare;
    
    /**
     * Default constructor.
     */
    public Name() {
        scan = new Scanner(System.in);
        first = "";
        middle = "";
        last = "";
        compare = true;
    }
    
    /**
     * Constuctor with parameters.
     * 
     * @param first the string reference for the first name.
     * @param middle the string reference for the middle name.
     * @param last the string reference for the last name.
     */
    public Name(String first, String middle, String last) {
        scan = new Scanner(System.in);
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
    /**
     * Set the first, middle, and last name.
     */
    public void inputName() {
        System.out.println("Enter your name here "
                + "(First, middle, and last names): ");
        this.first = scan.next();
        this.middle = scan.next();
        this.last = scan.next();
    }
    /**
     * Get First Name method.
     * 
     * @return first name of users.
     */
    public String getFirst() {
        return this.first;
    }
    
    /**
     * Get Middle Name method.
     * 
     * @return middle name of users.
     */
    public String getMiddle() {
        return this.middle;
    }

    /**
     * Get Last Name method.
     * 
     * @return last name of users.
     */
    public String getLast() {
        return this.last;
    }
    
    /**
     * Get the full name method with the order is fist, middle, and last name.
     * 
     * @return fist, middle, and last name of users.
     */
    public String firstMiddleLast() {
        return this.first + " " + this.middle + " " + this.last;
    }
    
    /**
     * Get the full name method with the order is last, first, and middle name.
     * 
     * @return last, first, and middle name of users.
     */
    public String lastFirstMiddle() {
        return this.last + ", " + this.first + " " + this.middle;
    }
    
    /**
     * Compare names method without case sensitive.
     * 
     * @param otherName name of the seconde user.
     * 
     * @return true if the names are the same.
     */
    public boolean equals(Name otherName) {
        compare = this.first.equalsIgnoreCase(otherName.getFirst()) 
                && this.middle.equalsIgnoreCase(otherName.getMiddle()) 
                && this.last.equalsIgnoreCase(otherName.getLast());
        return compare;
        
    }
    
    /**
     * Get the first character of the middle name.
     * 
     * @return 3 times of the first character. 
     */
    public String initials() {
        String char1 = (first.substring(0, 1)).toUpperCase();
        String char2 = (middle.substring(0, 1)).toUpperCase();
        String char3 = (last.substring(0, 1)).toUpperCase();
        return char1 + char2 + char3;
    }
    
    /**
     * Get length of the user names.
     * 
     * @return the integer of the full name.
     */
    public int length() {
        return first.length() + middle.length() + last.length();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Name [first=" + first + ", middle=" + middle 
                    + ", last=" + last + "]";
    }


    








    
    
 }
