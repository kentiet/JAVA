package chap05;

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
 * Demonstrates the use of radio buttons.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class QuoteOptionsPanel extends JPanel {
    /** Unique version of this panel. */
    private static final long serialVersionUID = 7814237504330228098L;
    
    /** Font size for quote. */
    private static final int FONT_SIZE = 24;
    /** Panel width. */
    private static final int WIDTH = 300;
    /** Panel height. */
    private static final int HEIGHT = 100;

    /** Holds variable quote. */
    private JLabel quote;
    /** Buttom to select comedy quote. */
    private JRadioButton comedy;
    /** Button to select philosophy quote. */
    private JRadioButton philosophy;
    /** Button to select carpentry quote. */
    private JRadioButton carpentry;
    /** Fixed commedy quote. */
    private String comedyQuote;
    /** Fixed philosophy quote. */
    private String philosophyQuote;
    /** Fixed carpentry quote. */
    private String carpentryQuote;


    /**
    * Sets up a panel with a label and a set of radio buttons
    * that control its text.
    */
    public QuoteOptionsPanel() {
        comedyQuote = "Take my wife, please.";
        philosophyQuote = "I think, therefore I am.";
        carpentryQuote = "Measure twice. Cut once.";

        quote = new JLabel("                                        ");
        quote.setFont(new Font("Helvetica", Font.BOLD, FONT_SIZE));

        comedy = new JRadioButton("Comedy");
        comedy.setBackground(Color.green);
        philosophy = new JRadioButton("Philosophy");
        philosophy.setBackground(Color.green);
        carpentry = new JRadioButton("Carpentry");
        carpentry.setBackground(Color.green);

        ButtonGroup group = new ButtonGroup();
        group.add(comedy);
        group.add(philosophy);
        group.add(carpentry);

        QuoteListener listener = new QuoteListener();
        comedy.addActionListener(listener);
        philosophy.addActionListener(listener);
        carpentry.addActionListener(listener);

        add(quote);
        add(comedy);
        add(philosophy);
        add(carpentry);

        setBackground(Color.green);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    /**
    * Represents the listener for all radio buttons.
    */
    private class QuoteListener implements ActionListener {
        /**
        * Sets the text of the label depending on which radio
        * button was pressed.
        * @param event indicates which button was pressed
        */
        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();

            if (source == comedy) {
                quote.setText(comedyQuote);
            } else if (source == philosophy) {
                quote.setText(philosophyQuote);
            } else {
                quote.setText(carpentryQuote);
            }
        }
    }
}
