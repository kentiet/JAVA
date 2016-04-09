/**
 * 
 */
package P3;
import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;


/**
 * @author KenTiet
 * @version 01
 */
public class Colors extends JApplet {
    
    public void paint(Graphics page) {
        
        final int PAGE_WIDTH = 600;
        final int PAGE_HEIGHT = 400;
        
        int x, y;
        int width, height; //The width and height
        int redCode, greenCode, blueCode;
        
        //instantiate the myColor object 
        Color myColor = new Color(2486921);
        
        //Set color and draw the rectangle
        setBackground(Color.white);
        page.setColor(Color.white);
        page.fillRect(0, 0, PAGE_WIDTH, PAGE_HEIGHT);
        
        //Set myColor
        page.setColor (myColor);
        
        
        x = 200;
        y = 125;
        width = 200;
        height = 150;
        
        page.fillRect(x, y ,width, height);
        
        redCode = myColor.getRed();
        greenCode = myColor.getGreen();
        blueCode = myColor.getBlue();
        
        page.setColor(Color.black);
        page.drawString("Red: " + redCode, 250, 145);
        page.drawString("Green: " + greenCode, 250, 165);
        page.drawString("Blue: " + blueCode, 250, 185);
        
 }
}
