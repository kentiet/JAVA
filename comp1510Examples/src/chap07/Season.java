package chap07;

/**
 * Enumerates the values for Season.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public enum Season {

    /** First season, winter. */
    winter("December through February"),

    /** Second season, spring. */
    spring("March through May"),

    /** Third season, summer. */
    summer("June through August"),

    /** Fourth season, fall (not autumn). */
    fall("September through November");

    /** Holds string to describe months of season. */
    private String span;

    /**
    * Constructor: Sets up each value with an associated string.
    * @param months String to describe which months make up season
    */
    Season(String months) {
        span = months;
    }

    /**
    * Returns the span message for this value.
    * @return String describing the time span of the season.
    */
    public String getSpan() {
        return span;
    }
}
