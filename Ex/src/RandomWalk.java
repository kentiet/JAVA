

import java.util.Random;

public class RandomWalk {

    Random rand = new Random();

    int x;
    int y;
    int max;
    int steps;
    int edge;
    int maxDistance;

    public RandomWalk(int max, int edge) {
        this.max = max;
        this.edge = edge;
        x = 0;
        y = 0;
        steps = 0;
        maxDistance = 0;
    }

    public RandomWalk(int max, int edge, int startX, int startY) {
        this.max = max;
        this.edge = edge;
        x = startX;
        y = startY;
        steps = 0;
        maxDistance = max(startX, startY);
    }

    public void takeStep() {
        int direction = rand.nextInt(4);
        switch (direction) {
            // Up
            case 0:
                y++;
                steps++;
                break;
            // Down
            case 1:
                y--;
                steps++;
                break;
            // Right
            case 2:
                x++;
                steps++;
                break;
            // Left
            case 3:
                x--;
                steps++;
                break;
        }
        maxDistance = max(maxDistance, max(x, y));
    }

    public boolean moreSteps() {
        return steps < max;

    }

    public boolean inBounds() {
        return x <= edge &&  x >= -edge && y <= edge && y >= -edge;
    }
    
    void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    private int max(int num1,int  num2) {
        if (Math.abs(num1) > Math.abs(num2)) {
            return Math.abs(num1);
        } else {
            return Math.abs(num2);
        }
    }
    
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public String toString() {
        return String.format("Steps Taken: %d; Position: (%d, %d)", steps, x, y);
    }

}
