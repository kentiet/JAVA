/**
 * 
 */
package q5;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The voting panel for Sam and Joe.
 * @author KenTiet
 * 
 * @version 1.0
 */
@SuppressWarnings("serial")
public class VoteCounterPanel extends JPanel {
    /**
     * The count of the vote of Joe.
     */
    private int countJoe;
    
    /**
     * The count of the vote of Sam.
     */
    private int countSam;
    
    /**
     * The label for Joe.
     */
    private JLabel labelJoe;
    
    /**
     * The label for Sam.
     */
    private JLabel labelSam; 
    
    /**
     * The vote button for Sam.
     */
    private JButton voteSam;

    /**
     * The vote button for Joe.
     */
    private JButton voteJoe;
    
    /**
     * The default constructor.
     */
    public VoteCounterPanel() {
        
        countJoe = 0;
        countSam = 0;
        voteJoe = new JButton("Vote Joe!");
        voteSam = new JButton("Vote Sam!");
        
        voteJoe.addActionListener(new JoeButtonListener());
        voteSam.addActionListener(new SamButtonListener());

        labelJoe = new JLabel("Vote for Joe: " + countJoe);
        labelSam = new JLabel("Vote for Sam: " + countSam);
        
        //Add button label for Joe and Sam
        add(voteJoe);
        add(voteSam);
        add(labelJoe);
        add(labelSam);
        
        //The sizr for outcoming panel
        final int panelWidth = 300;
        final int panelHeight = 100;
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.white);
    }
    
    /**
     * Repose a listener for Joe's button.
     */
    private class JoeButtonListener implements ActionListener {
       /**
        * Updates events when users push the button.
        * 
        * @param event event produced by pressing the button.
        */
        public void actionPerformed(ActionEvent event) {
            countJoe++;
            labelJoe.setText("Votes for Joe: " + countJoe);
        }
    }
    
    /**
     * Repose a listener for Sam's button.
     */
    private class SamButtonListener implements ActionListener { 
        /**
         * Updates events when users push the button.
         * 
         * @param event event produced by pressing the button.
         */
        public void actionPerformed(ActionEvent event) {
            countSam++;
            labelSam.setText("Votes for Sam: " + countSam);
        }
    }  
  }

