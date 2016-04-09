package p6;
import javax.swing.JFrame;

/**
 * The tester for VoteCounterPanel class.
 * @author KenTiet
 * @version 1.0
 */
public class VoteCounter {

    /**
     * The main method that drive the program.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        //Create the vote frame
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);

    }

}
