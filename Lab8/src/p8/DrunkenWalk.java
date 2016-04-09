package p8;
import java.util.Scanner;

/**DrunkenWalk.java.
 * @author KenTiet
 * @version 1.0.
 */
public class DrunkenWalk {

    /**Drives the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edge;
        int maxStep;
        int drunkWalk;
        int count = 0;
        System.out.println("Enter the boundary: ");
        edge = scan.nextInt();
        System.out.println("Enter the maximum");
        maxStep = scan.nextInt();
        System.out.println("Enter a drunken number");
        drunkWalk = scan.nextInt();
        
        for (int i = 0; i < drunkWalk; i++) {
            RandomWalk drunkenWalk = new RandomWalk(maxStep, edge);
            drunkenWalk.walk();
            if (drunkenWalk.inBounds()) {
                count++;    
            }
        }
        System.out.println(count++);
        scan.close();
    }
}
