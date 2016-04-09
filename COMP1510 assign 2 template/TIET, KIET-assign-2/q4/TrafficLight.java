package q4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <p>The Traffic Light Program is the application that can 
 * change the lights the traffic light when the button is pushed.</p>
 *
 * @author TIET, KIET
 * @version 1.0
 */
@SuppressWarnings("serial")
public class TrafficLight extends JFrame {

    /**
     * <p>The red value in RGB for back ground.</p>
     */
    private static final int BACK_RED = 192;

    /**
     * <p>The green value in RGB for back ground.</p>
     */
    private static final int BACK_GREEN = 154;

    /**
     * <p>The blue value in RGB for back ground.</p>
     */
    private static final int BACK_BLUE = 215;

    /**
     * <p>The red value in RGB for amber color.</p>
     */
    private static final int AMBER_RED_VALUE = 255;

    /**
     * <p>The green value in RGB for amber color.</p>
     */
    private static final int AMBER_GREEN_VALUE = 194;

    /**
     * <p>The blue value in RGB for amber color.</p>
     */
    private static final int AMBER_BLUE_VALUE = 0;

    /**
     * <p>The width of outcoming screen.</p>
     */
    private static final int SCREEN_WIDTH = 200;

    /**
     * <p>The height of outcoming screen.</p>
     */
    private static final int SCREEN_HEIGHT = 420;

    /**
     * <p>The Drawing Panel width.</p>
     */
    private static final int DRAW_SCREEN_WIDTH = 150;

    /**
     * <p>The Drawing Panel height.</p>
     */
    private static final int DRAW_SCREEN_HEIGHT = 340;

    /**
     * <p>The X position for ovals.</p>
     */
    private static final int X_OVAL_POSITION = 45;

    /**
     * <p>The Y position for ovals.</p>
     */
    private static final int Y_OVAL_POSITION = 100;

    /**
     * <p>The margin for padding the ovals.</p>
     */
    private static final int MARGIN = 80;

    /**
     * <p>The oval width.</p>
     */
    private static final int OVAL_WIDTH = 60;

    /**
     * <p>The oval height.</p>
     */
    private static final int OVAL_HEIGHT = 60;

    /**
     * <p>The X position of the first hanging line.</p>
     */
    private static final int X1_LINE_POSITION = 40;

    /**
     * <p>The Y position of the first hanging line.</p>
     */
    private static final int Y1_LINE_POSITION = 80;

    /**
     * <p>The X position of the second hanging line.</p>
     */
    private static final int X2_LINE_POSITION = 110;

    /**
     * <p>The Y position of the second hanging line.</p>
     */
    private static final int Y2_LINE_POSITION = 80;

    /**
     * <p>The margin for lines.</p>
     */
    private static final int LINE_MARGIN = 30;

    /**
     * <p>The X position for the text.</p>
     */
    private static final int STR_X_POSITION = 10;

    /**
     * <p>The Y position for the text.</p>
     */
    private static final int STR_Y_POSITION = 30;

    /**
     * <p>The Y position for the hanging rectangle.</p>
     */
    private static final int Y_RECT1 = 40;

    /**
     * <p>The width of the hanging rectangle.</p>
     */
    private static final int WIDTH_RECT1 = 150;

    /**
     * <p>The height of the hanging rectangle.</p>
     */
    private static final int HEIGHT_RECT1 = 10;

    /**
     * <p>The X position for the rectangle.</p>
     */
    private static final int X_RECT2 = 20;

    /**
     * <p>The Y position for the rectangle.</p>
     */
    private static final int Y_RECT2 = 80;

    /**
     * <p>The width of the rectangle.</p>
     */
    private static final int WIDTH_RECT2 = 110;

    /**
     * <p>The height of the rectangle.</p>
     */
    private static final int HEIGHT_RECT2 = 255;

    /**
     * <p>The division number for the condition.</p>
     */
    private static final int DIVISION = 3;

    /**
     * <p>Change light button.</p>
     */
    private JButton changeLightButton;

    /**
     * <p>Counter for increment to change the light.</p>
     */
    private int count;

    /**
     * <p>The default constructor of the traffic light which.</p>
     * <ul>
     * <li>Set the default close operation to exit</li>
     * <li>Create the a new content pane</li>
     * <li>Create the change light button</li>
     * <li>Set the size and visibility of the frame</li>
     * </ul>
     */
    public TrafficLight() {
        super("KIET TIET");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Instantiate the change light button.
        changeLightButton = new JButton("Push to Change Light");
        changeLightButton.addActionListener(new ChangeLight());
        
        // Instantiate the JPanel.
        JPanel panel = new JPanel();
        
        // Add the change light button and drawing panel into the frame
        panel.add(changeLightButton);
        panel.add(new DrawingPanel());
        
        panel.setBackground(new Color(BACK_RED, BACK_GREEN, BACK_BLUE));
        
        // Set the initial light is green
        count = 2;
        
        getContentPane().add(panel);
        
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setVisible(true);
    }

    /**
     * <p>Drawing Panel class for Traffic Light.</p>
     * 
     * @author TIET, KIET
     */
    private class DrawingPanel extends JPanel {

        /**
         * <p>Drawing Panel default contructor sets the size and 
         * background color of the panel.</p>
         */
        DrawingPanel() {
            setPreferredSize(new Dimension(DRAW_SCREEN_WIDTH, 
                    DRAW_SCREEN_HEIGHT));
            setBackground(new Color(BACK_RED, BACK_GREEN, BACK_BLUE));
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g  the graphics context which can be painted into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // The variable for calculate the condition to change light.
            int num;
            // Draw the string at the top.
            g.drawString("Hanging Traffic light!", STR_X_POSITION, 
                    STR_Y_POSITION);
            
            // Set color and draw the hanging rectangle.
            g.setColor(Color.black);
            g.fillRect(0, Y_RECT1, WIDTH_RECT1, HEIGHT_RECT1);
            
            //Set color and draw the rectangle, lines, and lights.
            g.setColor(Color.black);
            g.drawRect(X_RECT2, Y_RECT2, WIDTH_RECT2, HEIGHT_RECT2);
            g.drawLine(X1_LINE_POSITION, Y1_LINE_POSITION, X1_LINE_POSITION, 
                    Y1_LINE_POSITION - LINE_MARGIN);
            g.drawLine(X2_LINE_POSITION, Y2_LINE_POSITION, X2_LINE_POSITION, 
                    Y2_LINE_POSITION - LINE_MARGIN);
            g.setColor(Color.gray);
            g.fillOval(X_OVAL_POSITION, Y_OVAL_POSITION, OVAL_WIDTH, 
                    OVAL_HEIGHT);
            g.fillOval(X_OVAL_POSITION, Y_OVAL_POSITION + MARGIN, 
                    OVAL_WIDTH, OVAL_HEIGHT);
            g.fillOval(X_OVAL_POSITION, Y_OVAL_POSITION + MARGIN + MARGIN, 
                    OVAL_WIDTH, OVAL_HEIGHT);
            
            // Calculate the condition.
            num = count % DIVISION;
            
            // The conditions to change light.
            if (num == 0) {
                g.setColor(Color.red);
                g.fillOval(X_OVAL_POSITION, Y_OVAL_POSITION, 
                        OVAL_WIDTH, OVAL_HEIGHT);
                repaint();
            } else if (num == 1) {
                g.setColor(new Color(AMBER_RED_VALUE, AMBER_GREEN_VALUE, 
                        AMBER_BLUE_VALUE));
                g.fillOval(X_OVAL_POSITION, Y_OVAL_POSITION + MARGIN, 
                        OVAL_WIDTH, OVAL_HEIGHT);
                repaint();
            } else if (num == 2) {
                g.setColor(Color.green);
                g.fillOval(X_OVAL_POSITION, Y_OVAL_POSITION + MARGIN + MARGIN, 
                        OVAL_WIDTH, OVAL_HEIGHT);
                repaint();
            }

        }
    }

    /**
     * <p>Repose a listener for pushing the button to change light.</p>
     */
    private class ChangeLight implements ActionListener {

        /**
         * <p>Updates events when users push the button.</p>
         * 
         * @param event  event produced by pressing the button.
         */
        public void actionPerformed(ActionEvent event) {
            count++;
        }
    }

    /**
     * <p>The main method that drives the program.</p>
     * 
     * @param args  command line arguments.
     */
    public static void main(String[] args) {
        new TrafficLight();
    }

};
