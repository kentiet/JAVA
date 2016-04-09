package chap04;

/**
 * Represents one die (singular of dice) with faces showing values
 * between 1 and 6.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Die {
    /** maximum face value. */
    private static final int MAX = 6;

    /**current value showing on the die. */
    private int faceValue;

    /**
     * Constructor: Sets the initial face value to 1.
     */
    public Die() {
        faceValue = 1;
    }

    /**
     * Rolls the die and returns the result.
     * @return The face value after the roll
     */
    public int roll() {
        setFaceValue((int) (Math.random() * MAX) + 1);

        return getFaceValue();
    }

    /**
     * Face value mutator.
     * @param value The new face value for the die
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Face value accessor.
     * @return The current face value of the die
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a string representation of this die.
     * @return The current face value of the die converted to a string
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}
