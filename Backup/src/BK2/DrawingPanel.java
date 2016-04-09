/**
 * 
 */
package BK2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author KenTiet
 *
 */
public class DrawingPanel extends JPanel {
        
        private int count;
        private static int red;
        private static int yellow;
        private static int green;
        

        
        public DrawingPanel() {
            setPreferredSize(new Dimension(150, 340));
            setBackground(new Color(192, 154, 215));
            count = 2;
            red = 0;
            yellow = 1;
            green = 2;
        }
        
        public void increment() {
            count++;
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // replace this with your drawing code
            g.drawString("Hanging Traffic light!", 10, 30);
            g.setColor(Color.black);
            g.fillRect(0, 40, 150, 10);
            g.setColor(Color.black);
            g.drawRect(20, 80, 110, 255);
            g.drawLine(40, 80, 40, 50);
            g.drawLine(110, 80, 110, 50);
            g.setColor(Color.gray);
            g.fillOval(45, 100, 60, 60);
            g.fillOval(45, 180, 60, 60);
            g.fillOval(45, 260, 60, 60);
            int num = count % 3;
            if (num == 0) {
                g.setColor(Color.red);
                g.fillOval(45, 100, 60, 60);
                
            } else if (num == 1) {
                g.setColor(Color.yellow);
                g.fillOval(45, 180, 60, 60);
                
            } else if (num == 2) {
                g.setColor(Color.green);
                g.fillOval(45, 260, 60, 60);
               
            }

        }
    }
