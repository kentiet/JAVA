/**
 * 
 */
package q3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author KenTiet
 *
 */
public class ReboundPanel extends JPanel {
    private final int WIDTH = 400;
    private final int HEIGHT = 200;
    private final int DELAY = 20;
    private final int IMAGE_SIZE = 35;
    private ImageIcon image;
    private ImageIcon image2;
    private Timer timer;
    private int x;
    private int y;
    private int x2;
    private int y2;
    private double corebase = Math.sqrt(2 * IMAGE_SIZE);
    private double moveX;
    private double moveY;
    private double moveX2;
    private double moveY2;
    private double dx, dy, distance, ax, ay, va, va2, vb, vb2, vaP, vaP2;

    // ------------------------------------------------------------------
    // Sets up the panel, including the timer for the animation.
    // ------------------------------------------------------------------
    public ReboundPanel() {
        timer = new Timer(DELAY, new ReboundListener());
        image = new ImageIcon("src/q3/happyFace.gif");
        image2 = new ImageIcon("src/q3/happyFace.gif");
        x = 0;
        y = 40;
        moveX = 6;
        moveY = 6;
        moveX2 = 5;
        moveY2 = 8;
        x2 = 20;
        y2 = 80;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        timer.start();
    }

    // -----------------------------------------------------------------
    // Draws the image in the current location.
    // -----------------------------------------------------------------
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        image.paintIcon(this, page, x, y);
        image2.paintIcon(this, page, x2, y2);
    }
    
    // ******************************************************************
    // Represents the action listener for the timer.
    // ******************************************************************
    private class ReboundListener implements ActionListener {

        // --------------------------------------------------------------
        // Updates the position of the image and possibly the direction
        // of movement whenever the timer fires an action event.
        // --------------------------------------------------------------
        public void actionPerformed(ActionEvent event) {
            x += moveX;
            y += moveY;
            x2 += moveX2;
            y2 += moveY2;
            if (x < 0 || x > WIDTH - IMAGE_SIZE) {
                if (x < 0) {
                    x = 0;
                } else if (x > WIDTH - IMAGE_SIZE) {
                    x = WIDTH - IMAGE_SIZE;
                }
                moveX = moveX * -1;
            }
            if (y < 0 || y > HEIGHT - IMAGE_SIZE) {
                if (y < 0) {
                    y = 0;
                } else if (y > HEIGHT - IMAGE_SIZE) {
                    y = HEIGHT - IMAGE_SIZE;
                }
                moveY = moveY * -1;
            }
            if (x2 < 0 || x2 > WIDTH - IMAGE_SIZE) {
                if (x2 < 0) {
                    x2 = 0;
                } else if (x2 > WIDTH - IMAGE_SIZE) {
                    x2 = WIDTH - IMAGE_SIZE;
                }
                moveX2 = moveX2 * -1;
            }
            if (y2 < 0 || y2 > HEIGHT - IMAGE_SIZE) {
                if (y2 < 0) {
                    y2 = 0;
                } else if (y2 > HEIGHT - IMAGE_SIZE) {
                    y2 = HEIGHT - IMAGE_SIZE;
                }
                moveY2 = moveY2 * -1;
            }
            
            dx = x2 - x;
            dy = y2 - y;
            distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
            if (distance < corebase - 10) {
                ax = dx / distance;
                ay = dy / distance;
                va = (moveX * ax + moveY * ay);
                vb = ((-1) * moveX * ay + moveY * ax);
                va2 = (moveX2 * ax + moveY2 * ay);
                vb2 = ((-1) * moveX2 * ay + moveY2 * ax);
                vaP = va2;
                vaP2 = va;
                moveX = vaP * ax - vb * ay;
                moveY = vaP * ay + vb * ax;
                moveX2 = vaP2 * ax - vb2 * ay;
                moveY2 = vaP2 * ay + vb2 * ax; 
            }
            repaint();
        }
    }
}
