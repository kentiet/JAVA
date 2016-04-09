package chap05;

import java.io.File;
import static java.io.File.separator;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrates the use of Scanner to read file input and parse it
 * using alternative delimiters.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class URLDissector {
    /**
    * Reads urls from a file and prints their path components.
    * @param args Unused
    * @throws IOException If file is not found
    */
    public static void main(String[] args) throws IOException {
        String url;
        Scanner fileScan;
        Scanner urlScan;

        fileScan = new Scanner(new File("chap05" + separator + "urls.inp"));

        // Read and process each line of the file
        while (fileScan.hasNext()) {
            url = fileScan.nextLine();
            System.out.println("URL: " + url);

            urlScan = new Scanner(url);
            urlScan.useDelimiter("/");

            // Print each part of the url
            while (urlScan.hasNext()) {
                System.out.println("   " + urlScan.next());
            }
            System.out.println();
        }
    }
}
