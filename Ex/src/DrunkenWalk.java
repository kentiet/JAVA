

import java.util.Scanner;

public class DrunkenWalk {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the maximum number of steps: ");
        int max = scan.nextInt();
        System.out.print("Enter the edge of the platform: ");
        int edge = scan.nextInt();
        System.out.print("Enter the number of drunks to test: ");
        int numDrunks = scan.nextInt();
        
        int count = 0;
        for (int i = 0; i < numDrunks; i++) {
            RandomWalk drunk = new RandomWalk(max, edge);
            drunk.walk();
            if (drunk.inBounds()) {
                count++;
            }
        }
        System.out.println("The drunk fell off the platform " + count + " times.");
    }
}
