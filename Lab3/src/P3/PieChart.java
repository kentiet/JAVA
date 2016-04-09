package P3;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
/**
 * @author KenTiet
 *
 */
public class PieChart extends JApplet {
    
    public void paint (Graphics page) {
        
        final int mid = 80;
        final int top = 50;
        int width, height;
        
        width = 180;
        height = 180;
                
        
        page.setColor(Color.white);
        page.fillRect(0, 0, getWidth(), getHeight());
        
        page.fillOval(mid, top, width, height);
        page.setColor(Color.red);
        page.fillArc(mid, top, width, height, 0, 126);
        page.setColor(Color.yellow);
        page.fillArc(mid, top, width, height, 126, 54);
        page.setColor(Color.gray);
        page.fillArc(mid, top, width, height, 180, 54);
        page.setColor(Color.blue);
        page.fillArc(mid, top, width, height, 234, 90);
        page.setColor(Color.cyan);
        page.fillArc(mid, top, width, height, 324, 36);
        
        page.setColor(Color.black);
        page.drawString("Rent and Utilies", (mid + width), (top + 25));
        page.drawString("Transportation", (mid + width + 10), (mid + 90));
        page.drawString("Food", (mid + 70), (height + 80));
        page.drawString("Educational", (top - 50), (mid + 100 ));
        page.drawString("Miscellanous", (top - 60), (mid + 30));
        
        page.drawLine(mid + 120, top + 40, (mid + width), (top + 25));
        page.drawLine(mid + 120, top + 100, (mid + width + 10), (mid + 90));
        page.drawLine(mid + 80, top + 150, (mid + 90), (height + 70));
        page.drawLine(mid + 50, top + 120, (top + 30), (mid + 100 ));
        page.drawLine(mid + 40, top + 60, (top + 20), (mid + 25));
        
   
    }
}
