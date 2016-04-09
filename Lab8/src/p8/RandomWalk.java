/**
 * 
 */
package p8;
import java.util.Random;
/**RandomWalk.java.
 * @author KenTiet
 * @version 1.0.
 */
public class RandomWalk {
    /**
     * Create random object.
     */
    private Random generator = new Random();
    
    /**
     * X position.
     */
    private int xPosition;
    
    /**
     * Y position.
     */
    private int yPosition;
    
    /**
     * The boundary.
     */
    private int boundary;
    
    /**
     * The number of steps.
     */
    private int stepNum;
    
    /**
     * The maximun of steps.
     */
    private int maxStep;
    
    /**
     * The maximun distance.
     */
    private int maxDistance;
    
    /**
     * The numbers of random numbers.
     */
    private int genNum = 4;
    
    /**
     * Constructor with 2 parameters.
     * @param maxStep maximum of steps
     * @param boundary boundary of the spare.
     */
    public RandomWalk(int maxStep, int boundary) {
        this.maxStep = maxStep;
        this.boundary = boundary;
        xPosition = 0;
        yPosition = 0;
        maxDistance = 0;
    }
    
    /**
     * Constructor with 4 parameters.
     * @param maxStep maximum of steps
     * @param boundary boundary of the spare.
     * @param starX the original x position 
     * @param starY the original y position
     */
    public RandomWalk(int maxStep, int boundary, int starX, int starY) {
        this.maxStep = maxStep;
        this.boundary = boundary;
        xPosition = starX;
        yPosition = starY;
        maxDistance = max(starX, starY);
    }
    
    /**
     * takeStep method.
     */
    public void takeStep() {
        int step = generator.nextInt(genNum);
        switch(step) {
        case 0: 
            yPosition++;
            stepNum++;
            break;
        case 1:
            yPosition--;
            stepNum++;
            break;
        case 2:
            xPosition++;
            stepNum++;
            break;
        case 3:
            xPosition--;
            stepNum++;
            break;
        }
        maxDistance = max(xPosition, yPosition);
    }
    
    /**
     * moreSteps method.
     * @return true if number of steps smaller than maximum of steps.
     */
    public boolean moreSteps() {
        return stepNum < maxStep;
    }
    
    /**
     * inBounds method.
     * @return true if the walk is not out bound.
     */
    public boolean inBounds() {
        return xPosition <= boundary && xPosition >= -boundary &&
                yPosition <= boundary && yPosition >= -boundary;
    }
    
    /**
     * walk method.
     */
    public void walk() {
        while(moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    /**
     * Get X position method.
     * @return x position.
     */
    public int getX() {
        return xPosition;
    }
    
    /**
     * Get Y position method.
     * @return y position.
     */
    public int getY() {
        return yPosition;
    }
    
    /**
     * max method.
     * @param num1 x position
     * @param num2 y position
     * @return the larger number of 2 position.
     */
    private int max(int num1, int num2) {
        if (Math.abs(num1) > Math.abs(num2)) {
            return Math.abs(num1);
        } else {
            return Math.abs(num2);
        }
    }
    
    /**
     * Get the maximum distance.
     * @return the max distance.
     */
    public int getMaxDistance() {
        return maxDistance;
    }
    
    /**
     * toString method.
     * @return string
     */
    public String toString() {
        String str = "Steps: " + stepNum + "; Position: (" + (xPosition) + "," 
                    + (yPosition) + ")" + " Max Distance: " + maxDistance;
        return str;
    }
}
