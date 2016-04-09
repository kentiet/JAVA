package chap10;

import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * Demonstrates the use of a file chooser and a text area.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class DisplayFile {
    /**
    * Opens a file chooser dialog, reads the selected file and
    * loads it into a text area.
    * @param args Unused
    * @throws IOException if file not found by scanner
    */
    public static void main(String[] args) throws IOException {
        //width of text area in characters
        final int width = 20;
        //height of text area in characters
        final int height = 30;

        JFrame frame = new JFrame("Display File");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea ta = new JTextArea(width, height);
        final int fontSize = 18;
        Font font = new Font("System", Font.PLAIN, fontSize);
        ta.setFont(font);
        JFileChooser chooser = new JFileChooser();

        int status = chooser.showOpenDialog(null);

        if (status != JFileChooser.APPROVE_OPTION) {
            ta.setText("No File Chosen");
        } else {
            File file = chooser.getSelectedFile();
            Scanner scan = new Scanner(file);

            String info = "";
            while (scan.hasNext()) {
                info += scan.nextLine() + "\n";
            }

            ta.setText(info);
        }

        frame.getContentPane().add(ta);
        frame.pack();
        frame.setVisible(true);
    }
}
