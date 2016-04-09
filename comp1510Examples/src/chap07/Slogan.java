package chap07;

/**
 * Represents a single slogan string.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Slogan {
    /** Holds count of number of slogans created. */
    private static int count;

    /** Holds slogan. */
    private String phrase;

    /**
    * Constructor: Sets up the slogan and increments the number of
    * instances created.
    * @param str The slogan
    */
    public Slogan(String str) {
        phrase = str;
        count++;
    }

    /**
    * Returns this slogan as a string.
    * @return The slogan
    */
    public String toString() {
        return phrase;
    }

    /**
    * Returns the number of instances of this class that have been
    * created.
    * @return Number of slogans created
    */
    public static int getCount() {
        return count;
    }
}
