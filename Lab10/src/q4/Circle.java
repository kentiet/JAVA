/**
 * 
 */
package q4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

/**
 * Circle.java.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class Circle {

    /**
     * Center X of the circle.
     */
    private int centerX;

    /**
     * Center Y of the circle.
     */
    private int centerY;

    /**
     * The radius of the circle.
     */
    private int radius;

    /**
     * Color from color class.
     */
    private Color color;

    /**
     * Generator object.
     */
    private Random generator = new Random();

    /**
     * Constructor with point parameter.
     * @param point the given point.
     */
    public Circle(Point point) {
        radius = Math.abs(generator.nextInt()) % 50 + 25;
        color = new Color(Math.abs(generator.nextInt()) % 16777216);
        centerX = point.x;
        centerY = point.y;
    }
    
    /**
     * Draw method.
     * @param page object to draw on.
     */
    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(centerX - radius, centerY - radius, 
                radius * 2, radius * 2);
    }
    
    /**
     * Move method.
     * @param p the given point.
     */
    public void move(Point p) {
        centerX = p.x;
        centerY = p.y;
    }
    
    /**
     * Check is inside method.
     * @param p the given point
     * @return true if the distance less than radius.
     */
    public boolean isInside(Point p) {
        return (Math.sqrt(Math.pow(p.x - this.centerX, 2) 
                    + Math.pow(p.y - this.centerY, 2))) < this.radius;
    }
}
