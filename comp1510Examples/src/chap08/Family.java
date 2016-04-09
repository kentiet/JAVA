package chap08;

/**
 * Demonstrates the use of variable length parameter lists.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Family {
    /** Names of family members. */
    private String[] members;

    /**
    * Constructor: Sets up this family by storing the (possibly
    * multiple) names that are passed in as parameters.
    * @param names List of names of family members
    */
    public Family(String... names) {
        members = names;
    }

    /**
    * Returns a string representation of this family.
    * @return Family members, one per line
    */
    public String toString() {
        String result = "";

        for (String name : members) {
            result += name + "\n";
        }

        return result;
    }
}
