/**
 * 
 */
package p8;
import java.util.Scanner;
/**TestWalk.java.
 * @author KenTiet
 * @version 1.0
 */
public class TestWalk {

    /**Drives the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int boundary;
        int maxStep;
        int xPosition;
        int yPosition;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the boundary: ");
        boundary = scan.nextInt();
        System.out.println("Enter the maximum of steps: ");
        maxStep = scan.nextInt();
        System.out.println("Enter x and y positions: ");
        xPosition = scan.nextInt();
        yPosition = scan.nextInt();
        
        RandomWalk objOne = new RandomWalk(10, 5);
        RandomWalk objTwo = new RandomWalk(maxStep, boundary, 
                xPosition, yPosition);
        
        System.out.println(objOne);
        System.out.println(objTwo);
        
        for(int i = 0; i < 5; i++) {
            objOne.takeStep();
            System.out.println("The first obj " + objOne);
            objTwo.takeStep();
            System.out.println("The second obj" + objTwo);
            System.out.println();
        }

        RandomWalk objThree = new RandomWalk(200, 10);
        
        
        objThree.takeStep();
        System.out.println(objThree);
        objThree.walk();
        System.out.println(objThree);
        scan.close();
    }

}
