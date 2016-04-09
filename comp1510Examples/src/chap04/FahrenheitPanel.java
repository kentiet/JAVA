package chap04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Demonstrates the use of text fields.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class FahrenheitPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 7628660575507090457L;

    /** Holds the converted temperature in degrees Celsius. */
    private JLabel resultLabel;
    /** Holds a string representing a temperature in degrees Fahrenheit. */
    private JTextField fahrenheit;

    /**
     * Constructor: Sets up the main GUI components.
     */
    public FahrenheitPanel() {
        JLabel inputLabel = new JLabel("Enter Fahrenheit temperature:");
        JLabel outputLabel = new JLabel("Temperature in Celsius: ");
        resultLabel = new JLabel("---");

        final int inputWidth = 5;
        fahrenheit = new JTextField(inputWidth);
        fahrenheit.addActionListener(new TempListener());

        add(inputLabel);
        add(fahrenheit);
        add(outputLabel);
        add(resultLabel);

        final int panelWidth = 300;
        final int panelHeight = 75;
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.yellow);
    }

    /**
     * Represents an action listener for the temperature input field.
     */
    private class TempListener implements ActionListener {
        /**
         * Performs the conversion when the enter key is pressed in
         * the text field.
         * @param event The event from the text box signaling a change
         */
        public void actionPerformed(ActionEvent event) {
            int fahrenheitTemp;
            float celsiusTemp;
            final int freezingFahrenheit = 32;
            final float fahrenheitToCelsius = 0.55555556F;

            String text = fahrenheit.getText();

            fahrenheitTemp = Integer.parseInt(text);
            celsiusTemp = (fahrenheitTemp - freezingFahrenheit)
                                      * fahrenheitToCelsius;

            resultLabel.setText(Float.toString(celsiusTemp));
        }
    }
}
