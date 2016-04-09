package chap04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates a graphical user interface and an event listener.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class PushCounterPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = -1694196162632289132L;
    
    /** Holds the number of time the button is pressed. */
    private int count;
    /** Displays the number of times the button is pressed. */
    private JLabel label;

    /**
     * Constructor: Sets up the GUI.
     */
    public PushCounterPanel() {
        JButton push = new JButton("Push Me!");
        push.addActionListener(new ButtonListener());

        label = new JLabel("Pushes: " + count);

        add(push);
        add(label);

        final int panelWidth = 300;
        final int panelHeight = 40;
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.cyan);
    }

    /**
     * Represents a listener for button push (action) events.
     */
    private class ButtonListener implements ActionListener {
        /**
         * Updates the counter and label when the button is pushed.
        * @param event The event produced by the button when it is pressed
        */
        public void actionPerformed(ActionEvent event) {
            count++;
            label.setText("Pushes: " + count);
        }
    }
}
