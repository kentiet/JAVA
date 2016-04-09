/**
 * 
 */
package q3;

/**
 * Student.java. This program is designed to create student object with name,
 * addresses, and score. The programs is pretented to set scores and calculate
 * the avarage from the scores.
 * 
 * @author TIET, KIET
 * @version 1.0
 */
public class Student {

    /**
     * The students' first name.
     */
    private String firstName;

    /**
     * The students' last name.
     */
    private String lastName;

    /**
     * The students' home address.
     */
    private Address homeAddress;

    /**
     * The students' school address.
     */
    private Address schoolAddress;

    /**
     * The students' first test score.
     */
    private int firstScore;

    /**
     * The students' second test score.
     */
    private int secondScore;

    /**
     * The students' third test score.
     */
    private int thirdScore;
    
    /**
     * The upper range of the test score.
     */
    private final int testUpper = 100;

    /**
     * Student constructor with 4 parameters.
     * 
     * @param firstName
     *            First name of the student.
     * @param lastName
     *            Last name of the student.
     * @param homeAddress
     *            Home address of the student.
     * @param schoolAddress
     *            School address of the student.
     */
    public Student(String firstName, String lastName, 
                Address homeAddress, Address schoolAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }

    /**
     * Student constructor with 7 parameters.
     * 
     * @param firstName
     *            First name of the student.
     * @param lastName
     *            Last name of the student.
     * @param homeAddress
     *            Home address of the student.
     * @param schoolAddress
     *            School address of the student.
     * @param firstScore
     *            First score of test
     * @param secondScore
     *            Second score of test
     * @param thirdScore
     *            Third score of test
     */
    public Student(String firstName, String lastName, Address homeAddress, 
            Address schoolAddress, int firstScore, int secondScore, 
                int thirdScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        this.thirdScore = thirdScore;
    }

    /**
     * Default Constructor.
     */
    public Student() {
        firstScore = 0;
        secondScore = 0;
        thirdScore = 0;
    }

    /**
     * Set the three test scores.
     * 
     * @param testNumber
     *            the test number
     * @param score
     *            the score regarding to the test number
     *            
     * @throw IllegalArgumentException if the score out range from 0 to 100
     *             
     */
    public void setTestScore(int testNumber, int score) {
        if (score < 0 || score > testUpper) {
            throw new 
                IllegalArgumentException("The score must be from 0 to 100");
        } else {
            if (testNumber == 1) {
                this.firstScore = score;
            } else if (testNumber == 2) {
                this.secondScore = score;
            } else {
                this.thirdScore = score;
            }
        }
    }

    /**
     * Get the test score.
     * 
     * @param testNumber
     *            the test number
     * @return test score regarding to the inpunt test number.
     */
    public int getTestScore(int testNumber) {
        if (testNumber == 1) {
            return firstScore;
        } else if (testNumber == 2) {
            return secondScore;
        } else {
            return thirdScore;
        }
    }

    /**
     * The average of the test scores.
     * 
     * @return the score avarage.
     */
    public double avarage() {
        final int numTest = 3;
        return (firstScore + secondScore + thirdScore) / numTest;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [First Name: " + firstName + ", Last Name: " + lastName 
                + "]\n\n------Home Address------" + homeAddress 
                + "\n\n------School Address------" + schoolAddress
                + "\n\n------Score------\nFirst Score:\t" + firstScore 
                + "\nSecond Score:\t" + secondScore
                + "\nThird Score:\t" + thirdScore 
                + "\n\nAvarage Score:\t" + avarage() + "";
    }

}
