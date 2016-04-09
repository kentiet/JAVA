/**
 * 
 */
package p7;

/**Coin.java.
 * @author KenTiet
 * @version 1.0
 */
public class Coin {
    
    /**
     * Heads value.
     */
    public final int HEADS = 0;
    
    /**
     * Tails value.
     */
    public final int TAILS = 1;
    
    /**
     * face value.
     */
    private int face;
    
    /**
     * Constructor to flip coin.
     */
    public Coin() {
        flip();
    }
    
    /**
     * Random face value.
     */
    public void flip() {
        face = (int) (Math.random() * 2);
    }
    
    /**
     * isHeads method.
     * @return face with heads' value.
     */
    public boolean isHeads() {
        return (face == HEADS);
    }
    
    /**
     * toString method.
     * 
     * @return face name.
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
