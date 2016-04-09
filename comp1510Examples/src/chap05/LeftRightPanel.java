package chap05;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates the use of one listener for multiple buttons.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class LeftRightPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 3563547737309030910L;

    /** panel width. */
    private static final int WIDTH = 200;

    /** button panel height. */
    private static final int HEIGHT = 40;

    /** left button reference.  Need to check in the listener */
    private JButton left;

    /** Label to indicate which button was pressed. */
    private JLabel label;

    /**
    * Constructor: Sets up the GUI.
    */
    public LeftRightPanel() {
        JButton right;
        JPanel buttonPanel;
        left = new JButton("Left");
        right = new JButton("Right");

        ButtonListener listener = new ButtonListener();
        left.addActionListener(listener);
        right.addActionListener(listener);

        label = new JLabel("Push a button");

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        buttonPanel.setBackground(Color.blue);
        buttonPanel.add(left);
        buttonPanel.add(right);

        setPreferredSize(new Dimension(WIDTH, HEIGHT * 2));
        setBackground(Color.cyan);
        add(label);
        add(buttonPanel);
    }

    /**
    * Represents a listener for both buttons.
    */
    private class ButtonListener implements ActionListener {
        /**
        * Determines which button was pressed and sets the label
        * text accordingly.
        * @param event Indicates which button was pressed
        */
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == left) {
                label.setText("Left");
            } else {
                label.setText("Right");
            }
        }
    }
}
