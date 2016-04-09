package chap05;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of a ArrayList object.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Beatles {
    /**
    * Stores and modifies a list of band members.
    * @param args Unused
    */
    public static void main(String[] args) {
        List<String> band = new ArrayList<String>();

        band.add("Paul");
        band.add("Pete");
        band.add("John");
        band.add("George");

        System.out.println(band);

        int location = band.indexOf("Pete");
        band.remove(location);

        System.out.println(band);
        System.out.println("At index 1: " + band.get(1));

        band.add(2, "Ringo");

        System.out.println(band);
        System.out.println("Size of the band: " + band.size());
    }
}
