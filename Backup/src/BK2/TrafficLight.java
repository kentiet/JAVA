package BK2;

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
    
    /**
     * The change light button
     */
    private JButton changeLightButton;
    private DrawingPanel drawingPanel;

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
        drawingPanel = new DrawingPanel();
        panel.add(drawingPanel);
        panel.setBackground(new Color(192, 154, 215));

        
        getContentPane().add(panel);

        setSize(200, 420);
        setVisible(true);
    }


    private class ChangeLight implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            drawingPanel.increment();
            drawingPanel.repaint();
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
