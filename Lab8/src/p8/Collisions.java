/**
 * 
 */
package p8;

/**Collision.java.
 * @author KenTiet
 * @version 1.0
 */
public class Collisions {
    
    /**
     * Drives the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int count = 0;
        final int boundary = 100000;
        final int maxStep = 2000000;
        final int xPosition = 3;
        final int yPosition = 0;
        RandomWalk walk1 = new RandomWalk(boundary, maxStep, 
                        -xPosition, yPosition);
        RandomWalk walk2 = new RandomWalk(boundary, maxStep, 
                            xPosition, yPosition);
        
        for (int i = 0; i < boundary; i++) {
            walk1.takeStep();
            walk2.takeStep();
            if (samePosition(walk1, walk2)) {
                System.out.println("The position of the first walk: (" 
                        + walk1.getX()  + " ," + walk1.getY() + ")");
                System.out.println("The position of the second walk: (" 
                        + walk2.getX() + " ," + walk2.getY() + ")");
                System.out.println("The collisions position: (" + walk1.getX() 
                                    + "," + walk1.getY() + ")\n");
                count++;
            }
        }
        System.out.println("The number of collisions: " + count);
    }
    
    /**
     * Get same position method.
     * @param p1 first walk
     * @param p2 second walk
     * @return true whenever the position is same.
     */
    public static boolean samePosition(RandomWalk p1, RandomWalk p2) {
        return p1.getX() == p2.getX() && p1.getY() == p2.getY();
    }
}
