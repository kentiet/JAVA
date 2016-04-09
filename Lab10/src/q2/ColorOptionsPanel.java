package q2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * ColorOptionsPanel.java.
 * 
 * @author KenTiet
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ColorOptionsPanel extends JPanel {
    /**
     * The width of the screen.
     */
    private static final int WIDTH = 350;

    /**
     * The height of the screen.
     */
    private static final int HEIGHT = 100;

    /**
     * Font size for the text.
     */
    private static final int FONT_SIZE = 20;

    /**
     * number of colors.
     */
    private static final int NUM_COLORS = 5;

    /**
     * The arrays of color.
     */
    private Color[] color = new Color[NUM_COLORS];

    /**
     * The arrays of the radio buttons.
     */
    private JRadioButton[] colorButton = new JRadioButton[NUM_COLORS];

    /**
     * Heading of the screen.
     */
    private JLabel heading;

    /**
     * Color options panel constructor.
     */
    public ColorOptionsPanel() {
        heading = new JLabel("Let's pick a background color!");
        heading.setFont(new Font("Helvetie", Font.BOLD, FONT_SIZE));
        color[0] = Color.yellow;
        color[1] = Color.cyan;
        color[2] = Color.red;
        color[3] = Color.green;
        color[4] = Color.magenta;

        // Instantiate a ButtonGroup object and a ColorListener object
        colorButton[0] = new JRadioButton("Yellow", true);
        colorButton[1] = new JRadioButton("Cyan");
        colorButton[2] = new JRadioButton("Red");
        colorButton[3] = new JRadioButton("Green");
        colorButton[4] = new JRadioButton("Magenta");
        ButtonGroup button = new ButtonGroup();
        ColorListener listener = new ColorListener();
        add(heading);
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        for (int i = 0; i < NUM_COLORS; i++) {
            button.add(colorButton[i]);
            colorButton[i].addActionListener(listener);
            colorButton[i].setBackground(Color.white);
            add(colorButton[i]);
        }

    }

    /**
     * Response when each time users choose the different colors.
     * 
     * @author KenTiet
     */
    private class ColorListener implements ActionListener {

        /**
         * Updates event when users choose the color.
         * 
         * @param e
         *            event produced by choosing the radio button.
         */
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < NUM_COLORS; i++) {
                if (colorButton[i].isSelected()) {
                    setBackground(color[i]);
                }
            }
        }
    }
}
