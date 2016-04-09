package chap07;

/**
 * Represents a single integer as an object.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Num {
    /** number that object wraps. */
    private int value;

    /**
     * Sets up the new Num object, storing an initial value.
     * @param update holds value to be wrapped
     */
    public Num(int update) {
        value = update;
    }

    /**
     * Sets the stored value to the newly specified value.
     * @param update holds new value
     */
    public void setValue(int update) {
        value = update;
    }

    /**
     * Returns the stored integer value as a string with trailing space.
     * @return value converted to string
     */
    public String toString() {
        return value + "";
    }
}
