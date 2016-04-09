/**
 * 
 */
package q4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**CirclePanel.java.
 * @author KenTiet
 * @version 1.0
 */
@SuppressWarnings("serial")
public class CirclePanel extends JPanel {
    
    /**
     * Width of the panel.
     */
    private static final int WIDTH = 600;
    
    /**
     * height of the panel.
     */
    private static final int HEIGHT = 400;
    
    /**
     * circle object from Circle class.
     */
    private Circle circle;
    
    
    /**
     * Circle panel.
     */
    public CirclePanel() {
        addMouseListener(new CirclesListener());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
    /**
     * Draws current circle.
     * @param page the graphics object to draw on.
     */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        if (circle != null) {
            circle.draw(page);
        }
    }
    
    /**
     * 
     * @author KenTiet
     *
     */
    private class CirclesListener implements MouseListener {
        
        /**
         * 
         */
        public void mousePressed(MouseEvent event) {
            if (circle == null) {
                circle = new Circle(event.getPoint());
            } else if (circle.isInside(event.getPoint())) {
                circle = null;
            } else {
                circle.move(getMousePosition());
            }
            repaint();
        }
        
        public void mouseClicked(MouseEvent event) {
        }

        public void mouseReleased(MouseEvent event) {
        }
        
        /**
         * 
         */
        public void mouseEntered(MouseEvent event) {
            setBackground(Color.white);
        }
        
        /**
         * 
         */
        public void mouseExited(MouseEvent event) {
            setBackground(Color.gray);
        }
    }
}
