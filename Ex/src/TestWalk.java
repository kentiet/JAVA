
// ************************************************************
// TestWalk.java
//
// Program to test methods in the RandomWalk class.
// ************************************************************

import java.util.Scanner;

public class TestWalk {

    public static void main(String[] args) {
        int maxSteps;  // maximum number of steps in a walk
        int maxCoord;  // the maximum x and y coordinate
        int x, y;  // starting x and y coordinates for a walk
        Scanner scan = new Scanner(System.in);
        System.out.println("\nRandom Walk Test Program");
        System.out.println();
        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        System.out.print("Enter the starting x and y coordinates with "
                + "a space between: ");
        x = scan.nextInt();
        y = scan.nextInt();
        
        RandomWalk walk1 = new RandomWalk(10, 5);
        RandomWalk walk2 = new RandomWalk(maxSteps, maxCoord, x, y);
        
        System.out.println(walk1);
        System.out.println(walk2);
        
        for (int i = 0; i < 5; i++) {
            walk1.takeStep();
            System.out.println("Walk 1: " + walk1 + "Maximum Distance: " + walk1.getMaxDistance());
            walk2.takeStep();
            System.out.println("Walk 2: " + walk2 + "Maximum Distance: " + walk2.getMaxDistance());
        } 
        
        RandomWalk walk3 = new RandomWalk(200, 10);
        walk3.walk();
        System.out.println(walk3);
    }
}
