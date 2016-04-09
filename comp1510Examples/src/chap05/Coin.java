package chap05;

/**
 * Represents a coin with two sides that can be flipped.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Coin {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Current coin's face showing. */
    private int face;

    /**
    * Sets up the coin by flipping it initially.
    */
    public Coin() {
        flip();
    }

    /**
    * Flips the coin by randomly choosing a face value.
    */
    public void flip() {
        face = (int) (Math.random() * 2);
    }

    /**
    * Returns true if the current face of the coin is heads.
    * @return true if current face of the coin is heads
    */
    public boolean isHeads() {
        return (face == HEADS);
    }

    /**
    * Return current face which is up.
    * @return current face
    */
    public int getFace() {
        return face;
    }

    /**
    * Returns the current face of the coin as a string.
    * @return "Heads" or "Tails"
    */
    public String toString() {
        String faceName;
        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        return faceName;
    }
}
