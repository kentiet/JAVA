package chap08;

import java.text.NumberFormat;

/**
 * Represents a compact disc.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class CD {
    /** title of CD. */
    private String title;
    /** Artist on CD. */
    private String artist;
    /** Cost of CD in $. */
    private double cost;
    /** Number of tracks on CD. */
    private int tracks;

    /**
    * Creates a new CD with the specified information.
    * @param name CD title
    * @param singer CD artist
    * @param price Cost of CD in $
    * @param numTracks Number of tracks on CD
    */
    public CD(String name, String singer, double price, int numTracks) {
        title = name;
        artist = singer;
        cost = price;
        tracks = numTracks;
    }

    /**
    * Returns a string description of this CD.
    * @return String formatted with local currency for cost
    */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String description;

        description = fmt.format(cost) + "\t" + tracks + "\t";
        description += title + "\t" + artist;

        return description;
    }
}
