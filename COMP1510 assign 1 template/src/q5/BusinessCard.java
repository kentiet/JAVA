package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This is Business Card class. By using JFram, this class is going to draw 
 * a business card which contain personal information 
 * and company's information.</p>
 *
 * @author TIET, KIET
 * @version 1.0
 */
@SuppressWarnings("serial")
public class BusinessCard extends JFrame {
    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 10;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 40;
    
    /**
     * <p>The padding value to configure the position of text.</p>
     */
    private static final int PADDING = 20;
    
    /**
     * <p>The width of the output screen.</p>
     */
    private static final int WIDTH_SCREEN = 360;
    
    /**
     * <p>The height of the output screen.</p>
     */
    private static final int HEIGHT_SCREEN = 210;
    
    /**
     * <p>The x position of the staring point of the rectangle.</p>
     */
    private static final int X_RECTANGLE = 5;
    
    /**
     * <p>The y position of the staring point of the rectangle.</p>
     */
    private static final int Y_RECTANGLE = 20;
    
    /**
     * <p>The width of the rectangle.</p>
     */
    private static final int REC_WIDTH = 190;
    
    /**
     * <p>The height of the rectangle.</p>
     */
    private static final int REC_HEIGHT = 150;
    
    /**
     * The red value in RGB for background color. 
     */
    private static final int RED_BACK_VALUE = 0;
    
    /**
     * The green value in RGB for background color.
     */
    private static final int GREEN_BACK_VALUE = 0;
    
    /**
     *<p>he blue value in RGB for background color.</p> 
     */
    private static final int BLUE_BACK_VALUE = 0;
    
    /**
     * <p>The red value in RGB for text color.</p> 
     */
    private static final int RED_TEXT_VALUE = 220;
    
    /**
     * The green value in RGB for text color.
     */
    private static final int GREEN_TEXT_VALUE = 214;
    
    /**
     * <p>The blue value in RGB for text color.</p>
     */
    private static final int BLUE_TEXT_VALUE = 255;

    /**
     * <p>The default constructor: </p>
     *  <ul>
     *      <li>Sets the title of this application.</li>
     *      <li>Sets the default close operation to exit.</li>
     *      <li>Set (create) a new content pane.</li>
     *      <li>Set the size of the output screen.</li>
     *      <li>Sets the visibility of the frame to true to show.</li>
     *  </ul> 
     */
    public BusinessCard() {
        super("KIET TIET");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BusinessCardPanel());
        setSize(WIDTH_SCREEN, HEIGHT_SCREEN);
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    final class BusinessCardPanel extends JPanel {

        /**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        private Image img;

        /**
         * <p>The default constructor that retrieves an image to draw.</p>
         */
        private BusinessCardPanel() {
            img = null;
            img = new ImageIcon(BusinessCardPanel.class.getResource(
                "/q5/ken-name.gif")).getImage();
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context which can be painted into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // Set the back ground color in black
            setBackground(new Color(RED_BACK_VALUE, 
                    GREEN_BACK_VALUE, BLUE_BACK_VALUE));
            
            // Set the text color
            g.setColor(new Color(RED_TEXT_VALUE, 
                    GREEN_TEXT_VALUE, BLUE_TEXT_VALUE));
            
            // Draw a string for name
            g.drawString("Name: TIET, KIET", X_POSITION, Y_POSITION);
            
            // Draw a string for company
            g.drawString("Number One Java Company", X_POSITION, Y_POSITION 
                            + PADDING);
            
            // Draw a string for address
            g.drawString("Address: 555 Seymour Street",
                            X_POSITION, Y_POSITION + PADDING + PADDING);
            
            // Draw a string for phone number
            g.drawString("Phone: (604) 782-6332", X_POSITION, Y_POSITION 
                            + PADDING + PADDING + PADDING);
            
            // Draw a string for fax number
            g.drawString("Fax: (604) 781-6112", X_POSITION, Y_POSITION 
                            + PADDING + PADDING + PADDING + PADDING);
            
            // Draw a string for email
            g.drawString("Email: javano.1@gmail.com",
                            X_POSITION, Y_POSITION + PADDING 
                            + PADDING + PADDING + PADDING + PADDING);
            
            // Draw a string for website
            g.drawString("Website: www.javaforver.ca", 
                            X_POSITION, Y_POSITION + PADDING + PADDING 
                            + PADDING + PADDING + PADDING + PADDING);
            
            // Draw the rectangle for separate text from picture
            g.drawRect(X_RECTANGLE, Y_RECTANGLE, REC_WIDTH, REC_HEIGHT);
            
            // Set image position
            g.drawImage(img, (HEIGHT_SCREEN - PADDING / 2), 0, this);
        }
    }

    /**
     * <p>The main method that drives the program.</p>
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        new BusinessCard();
    }

};
