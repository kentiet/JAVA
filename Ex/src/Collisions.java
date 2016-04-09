
public class Collisions {
    public static void main(String[] args) {
        RandomWalk particle1 = new RandomWalk(100000, 2000000, -3, 0);
        RandomWalk particle2 = new RandomWalk(100000, 2000000, 3, 0);
        
        int count = 0;
        while(particle1.moreSteps() && particle2.moreSteps()) {
            particle1.takeStep();
            particle2.takeStep();
            if (samePosition(particle1, particle2)) {
                count++;
            }
        }
        
        System.out.println("The particles collided " + count + " times.");
    }
    
    public static boolean samePosition(RandomWalk p1, RandomWalk p2) {
        return p1.getX() == p2.getX() && p1.getY() == p2.getY();
    }
}
