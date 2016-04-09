package q2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Your Name goes here
 * @version 1.0
 */
@SuppressWarnings("serial")
public class DrawRectangle extends JFrame {
    

    /**
     *
     */
    public DrawRectangle() {
        super("KIET TIET");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new DrawRectanglePanel());
        setSize(400, 400); // you can change this size but don't make it HUGE!
        setVisible(true);
    }

    /**
     *
     */
    private class DrawRectanglePanel extends JPanel implements MouseListener,
            MouseMotionListener {
        
            private Point p1;
            private Point p2;

        /**
         */
        public DrawRectanglePanel() {
            addMouseListener(this);
            addMouseMotionListener(this);
            setBackground(Color.black);
        }

        /**
         *
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            
            // DRAWING CODE HERE
            
            g.setColor(Color.yellow);
            if (p1 != null && p2 != null) {
                if (p2.x >= getWidth()) {
                    p2.x = getWidth() - 1;
                }
                if (p2.x <= 0) {
                    p2.x = 1;
                }
                if (p2.y >= getHeight()) {
                    p2.y = getHeight() - 1;
                }
                if (p2.y <= 0) {
                    p2.y = 1;
                }
                int width = Math.abs(p2.x - p1.x);
                int height = Math.abs(p2.y - p1.y);
                // Draw the rectangle
                g.drawRect((p1.x < p2.x) ? p1.x : p2.x, (p1.y < p2.y) ? p1.y
                        : p2.y, width, height);
            }
            System.out.println("Paint called");
        }

        public void mousePressed(MouseEvent e) {
            p1 = e.getPoint();
            System.out.println("Mouse pressed called");
        }

        public void mouseReleased(MouseEvent e) {
            p2 = e.getPoint();
            repaint();
            System.out.println("Mouse released called");
        }

        public void mouseDragged(MouseEvent e) {
            p2 = e.getPoint();
            repaint();
            System.out.println("Mouse dragged called");
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mouseClicked(MouseEvent e) {
        }

        public void mouseMoved(MouseEvent e) {
        }

    }

    /**
     *
     */
    public static void main(String[] args) {
        new DrawRectangle();
    }

};
