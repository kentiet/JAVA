package chap05;

/**
 * Demonstrates the use of an if-else statement.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class CoinFlip {
    /**
    * Creates a Coin object, flips it, and prints the results.
    * @param args Unused
    */
    public static void main(String[] args) {
        Coin myCoin = new Coin();

        myCoin.flip();

        System.out.println(myCoin);

        if (myCoin.isHeads()) {
            System.out.println("You win.");
        } else {
            System.out.println("Better luck next time.");
        }
    }
}
