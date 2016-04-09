package q3;

import java.util.Scanner;

/**
 * <p>
 * TestStudent.java. 
 * This program is the driver program of the student.java
 * class.
 * </p>
 * 
 * @author TIET, KIET
 * @version 1.0
 */
public class TestStudent {
    /**
     * <p>
     * This is the main method (entry point) drives the program.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        // The first score
        final int firstScore = -100;
        // The second score
        final int secondScore = 300;
        // The third score
        final int thirdScore = 80;
        // The new first score
        final int newFirstScore = 100;
        // The second score
        final int newSecondScore = 90;
        // The first test
        final int thirdTest = 3;
        // The second test
        final int secondTest = 2;
        // The third test
        final int firstTest = 1;

        // Get input from user
        Scanner scan = new Scanner(System.in);

        // Create home address object
        Address home = new Address("23RD AVE", "Vancouver", "B.C.", "V5R 1A7");

        // Create school address object
        Address school = new Address("555 Seymoure", 
                    "Vancouver", "B.C.", "1A1 A1A");

        // Create student object
        Student studentOne = new Student("Ken", "Tiet", home, school);
        
        try {
            studentOne.setTestScore(firstTest, firstScore);
            studentOne.setTestScore(secondTest, secondScore);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        // Set new score
        studentOne.setTestScore(firstTest, newFirstScore);
        studentOne.setTestScore(secondTest, newSecondScore);
        studentOne.setTestScore(thirdTest, thirdScore);
        
        // Print out the result
        System.out.println("The score of test 1: " 
                    + studentOne.getTestScore(firstTest));
        System.out.println("The score of test 2: " 
                    + studentOne.getTestScore(secondTest));
        System.out.println("The score of test 3: " 
                    + studentOne.getTestScore(thirdTest) + "\n");
        System.out.println(studentOne);
        System.out.println("Question three was called and ran sucessfully.");
        scan.close();
    }

};
