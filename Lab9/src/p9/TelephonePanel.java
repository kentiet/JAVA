/**
 * 
 */
package p9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Telephone Panel.
 * 
 * @author KenTiet
 * @version 1.0
 */
@SuppressWarnings("serial")
public class TelephonePanel extends JPanel {

    /**
     * Phone Label.
     */
    private JLabel phone;

    /**
     * Telephone Panel.
     */
    public TelephonePanel() {

        setLayout(new BorderLayout());
        setBackground(Color.gray);

        JPanel p1 = new JPanel();
        phone = new JLabel("Your Phone Number");
        p1.add(phone);
        p1.setBorder(BorderFactory.createLoweredBevelBorder());
        add(p1, BorderLayout.NORTH);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 3));

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("#");
        JButton b11 = new JButton("0");
        JButton b12 = new JButton("*");

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);

        add(p2, BorderLayout.CENTER);

    }

}
