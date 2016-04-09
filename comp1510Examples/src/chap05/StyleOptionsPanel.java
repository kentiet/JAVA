package chap05;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates the use of check boxes.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class StyleOptionsPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 8314855840216704352L;
    
    /** Font size of saying. */
    private static final int FONT_SIZE = 36;
    /** Panel width. */
    private static final int WIDTH = 300;
    /** Panel height. */
    private static final int HEIGHT = 100;

    /** Holds styled saying. */
    private JLabel saying;
    /** Check box to indicate saying should be bold. */
    private JCheckBox bold;
    /** Check box to indicate saying should be italic. */
    private JCheckBox italic;

    /**
    * Sets up a panel with a label and some check boxes that
    * control the style of the label's font.
    */
    public StyleOptionsPanel() {
        saying = new JLabel("Say it with style!");
        saying.setFont(new Font("Helvetica", Font.PLAIN, FONT_SIZE));

        bold = new JCheckBox("Bold");
        bold.setBackground(Color.cyan);
        italic = new JCheckBox("Italic");
        italic.setBackground(Color.cyan);

        StyleListener listener = new StyleListener();
        bold.addItemListener(listener);
        italic.addItemListener(listener);

        add(saying);
        add(bold);
        add(italic);

        setBackground(Color.cyan);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    /**
    * Represents the listener for both check boxes.
    */
    private class StyleListener implements ItemListener {
        /**
        * Updates the style of the label font style.
        * @param event Indicates a check box has changed state
        */
        public void itemStateChanged(ItemEvent event) {
            int style = Font.PLAIN;

            if (bold.isSelected()) {
                style = Font.BOLD;
            }

            if (italic.isSelected()) {
                style += Font.ITALIC;
            }

            saying.setFont(new Font("Helvetica", style, FONT_SIZE));
        }
    }
}
