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
public class Face extends JApplet {
    
    public void paint (Graphics page) {
        
        final int mid = 50;
        final int top = 50;
        int height = 100;
        int width = 100;
        
        //Set Color for the face
        page.setColor(Color.blue);
        page.fillOval(top, mid, height, width);
        
        //Set color for eyes
        page.setColor(Color.black);
        
        //Left eye
        page.fillOval(top + 20, top + 20, height - 80, height - 80);
        //Right eye
        page.fillOval(top + 60, top + 20, height - 80, height - 80);
        
        //Set color for nose and mouth
        page.setColor(Color.yellow);
        //Lines for nose
        page.drawLine(100, 100, 90, 115);
        page.drawLine(100, 100, 110, 115);
        page.drawLine(90, 115, 110, 115);
        
        //Lines for mouth
        page.drawArc(50, 30, 100, 100, -110, 45);
        
        //Set Color for ears
        page.setColor(Color.blue);
        
        //Left ear
        page.fillOval(40, 80, 30, 30);
        //Right ear
        page.fillOval(130, 80, 30, 30);
    }

}
