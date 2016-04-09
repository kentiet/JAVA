package chap08;

import java.io.File;
import static java.io.File.separator;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrates the use of an array of objects.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Tunes {
    /**
    * Creates a CDCollection object and adds some CDs to it. Prints
    * reports on the status of the collection.
    * @param args Unused
    * @throws IOException if file does not exist
    */
    public static void main(String[] args) throws IOException {
        CDCollection music = new CDCollection();

        Scanner scan = new Scanner(new File("chap08" + separator + "CDs.txt"));

        while (scan.hasNextLine()) {
            music.addCD(scan.nextLine(), scan.nextLine(), scan.nextFloat(),
                    scan.nextInt());
            scan.nextLine();     //advance past end of line after reading int
        }

        System.out.println(music);
    }
}
