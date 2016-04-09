package chap07;

/**
 * Demonstrates the use of a full enumerated type.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class SeasonTester {
    /**
     * Iterates through the values of the Season enumerated type.
     *
     * @param args
     *        Unused
     */
    public static void main(String[] args) {
        for (Season time : Season.values()) {
            System.out.println(time + "\t" + time.getSpan());
        }
    }
}
