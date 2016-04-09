/**
 * 
 */
package p6;
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
     * The label for the person will win.
     */
    private  JLabel labelWin;
    
    /**
     * The default constructor.
     */
    public VoteCounterPanel() {
        
        countJoe = 0; //Joe's initial conuter
        countSam = 0; //Sam's initial counter
        
        //Vote button for Joe and Sam
        voteJoe = new JButton("Vote Joe!");
        voteSam = new JButton("Vote Sam!");
        
        
        voteJoe.addActionListener(new ActionButtonListener());
        voteSam.addActionListener(new ActionButtonListener());
        
        // Label for Jor and Sam
        labelJoe = new JLabel("Vote for Joe: " + countJoe);
        labelSam = new JLabel("Vote for Sam: " + countSam);
        
        // Label for who will win
        labelWin = new JLabel("Let's Vote!!!");
        
        //Add button label for Joe and Sam
        add(labelWin);
        add(voteJoe);
        add(voteSam);
        add(labelJoe);
        add(labelSam);
        
        
        //The size for outcoming panel
        final int panelWidth = 300;
        final int panelHeight = 100;
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.white);
    }
    
    /**
     * Repose a listener for Joe, Sam and the person who win.
     */
    private class ActionButtonListener implements ActionListener {
       /**
        * Updates events when users push the button.
        * 
        * @param event event produced by pressing the button.
        */
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == voteJoe) {
                countJoe++;
                labelJoe.setText("Votes for Joe: " + countJoe);
            } else {
                countSam++;
                labelSam.setText("Votes for Sam: " + countSam);
            }
            
            if (countJoe == countSam) {
                labelWin.setText("It's a tie");
            } else if (countJoe > countSam) {
                labelWin.setText("Joe wins");
            } else {
                labelWin.setText("Sam wins");      
            }
        }
    }
}