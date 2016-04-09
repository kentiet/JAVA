package chap08;

/**
 * Represents a school grade.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Grade {
    /** Name of grade. A+, A, A-, etc. */
    private String name;

    /** lowest percentage to get grade. */
    private int lowerBound;

    /**
    * Constructor: Sets up this Grade object with the specified
    * grade name and numeric lower bound.
    * @param grade Name of grade
    * @param cutoff Lowest percentage to get grade
    */
    public Grade(String grade, int cutoff) {
        name = grade;
        lowerBound = cutoff;
    }

    /**
    * Returns a string representation of this grade.
    * @return name of grade and lower bound for grade
    */
    public String toString() {
        return name + "\t" + lowerBound;
    }

    /**
    * Name mutator.
    * @param grade Name of grade to store
    */
    public void setName(String grade) {
        name = grade;
    }

    /**
    * Lower bound mutator.
    * @param cutoff Lower bound for grade
    */
    public void setLowerBound(int cutoff) {
        lowerBound = cutoff;
    }

    /**
    * Name accessor.
    * @return name of grade
    */
    public String getName() {
        return name;
    }

    /**
    * Lower bound accessor.
    * @return lower bound for grade
    */
    public int getLowerBound() {
        return lowerBound;
    }
}
