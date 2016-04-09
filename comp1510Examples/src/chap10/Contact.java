package chap10;

/**
 * Represents a phone contact.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Contact implements Comparable<Contact> {
    /** First name of contact. */
    private String firstName;

    /** Last name of contact. */
    private String lastName;

    /** phone number of contact. */
    private String phone;

    /**
    * Constructor: Sets up this contact with the specified data.
    * @param first First name
    * @param last Last name
    * @param telephone Phone number
    */
    public Contact(String first, String last, String telephone) {
        firstName = first;
        lastName = last;
        phone = telephone;
    }

    /**
    * Returns a description of this contact as a string.
    * @return all instance variables
    */
    public String toString() {
        return lastName + ", " + firstName + "\t" + phone;
    }

    /**
    * Returns a description of this contact as a string.
    * @param other Another contact
    * @return whether other is a contact equal to this contact
    */
    public boolean equals(Object other) {
        return (other instanceof Contact
                && lastName.equals(((Contact) other).getLastName())
                && firstName.equals(((Contact) other).getFirstName()));
    }

    /**
     * Returns hash of this contact.
     * @return hash code
     */
    public int hashCode() {
        return lastName.hashCode() ^ firstName.hashCode();
    }

    /**
    * Uses both last and first names to determine ordering.
    * @param other Contact to compare to this one
    * @return value whose sign indicates relationship of this contact to other
    */
    public int compareTo(Contact other) {
        int result;

        String otherFirst = other.getFirstName();
        String otherLast = other.getLastName();

        if (lastName.equals(otherLast)) {
            result = firstName.compareTo(otherFirst);
        } else {
            result = lastName.compareTo(otherLast);
        }

        return result;
    }

    /**
    * First name accessor.
    * @return first name of this contact
    */
    public String getFirstName() {
        return firstName;
    }

    /**
    * Last name accessor.
    * @return last name of this contact
    */
    public String getLastName() {
        return lastName;
    }
}
