package BK;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <p>
 * This is where you put your description about what this class does. You don't
 * have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 * </p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TrafficLight extends JFrame {

    private JButton changeLightButton;
    private static int count;
    private static int red;
    private static int yellow;
    private static int green;


    /**
     * <p>
     * The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).
     * </p>
     */
    public TrafficLight() {
        changeLightButton = new JButton("Push to Change Light");
        changeLightButton.addActionListener(new ChangeLight());
        JPanel panel = new JPanel();
        panel.add(changeLightButton);
        panel.add(new DrawingPanel());
        panel.setBackground(new Color(192, 154, 215));
        count = 2;
        red = 0;
        yellow = 1;
        green = 2;
        
        getContentPane().add(panel);

        setSize(200, 420);
        setVisible(true);
    }

    class DrawingPanel extends JPanel {
        public DrawingPanel() {
            setPreferredSize(new Dimension(150, 340));
            setBackground(new Color(192, 154, 215));
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
                repaint();
            } else if (num == 1) {
                g.setColor(Color.yellow);
                g.fillOval(45, 180, 60, 60);
                repaint();
            } else if (num == 2) {
                g.setColor(Color.green);
                g.fillOval(45, 260, 60, 60);
                repaint();
            }

        }
    }

    private class ChangeLight implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            count++;
        }
    }

    /**
     * <p>
     * The main method.
     * </p>
     */
    public static void main(String[] args) {
        new TrafficLight();
    }

};
