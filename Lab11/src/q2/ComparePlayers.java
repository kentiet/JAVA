/**
 * 
 */
package q2;

import java.util.Scanner;

/**
 * @author KenTiet
 *
 */
public class ComparePlayers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Players player1 = new Players();
        Players player2 = new Players();
        Scanner scan = new Scanner(System.in);
        player1.readPlayer();
        player2.readPlayer();
        if (player1.equals(player2)) {
            System.out.println("Players are the same");
        } else {
            System.out.println("Different players");
        }
        scan.close();
    }

}
