/**
 * 
 */
package p7;

/** Runs.java.
 * @author KenTiet
 * @version 1.0
 */
public class Runs {

    /**Drives the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        final int FLIPS = 100;
        
        int currentRun = 0;
        int maxRun = 0;
        
        Coin coin1 = new Coin();
        
        for (int i = 0; i < FLIPS; i++) {
            coin1.flip();
            System.out.println(coin1);
            
            if (coin1.isHeads()) {
                currentRun++;
            } else {
                currentRun = 0;
            }
            
            if (currentRun > maxRun) {
                maxRun = currentRun;
            }
        }
        System.out.println();
        System.out.println("The longest runs is: " + maxRun);
        
    }
}
