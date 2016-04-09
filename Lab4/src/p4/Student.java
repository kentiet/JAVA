/*
 * 
 */
package p4;
/**
 * Import Scanner class.
 */
import java.util.Scanner;

/**
 * <p>Student class contains methods which is being used be Grades application
 * such as get student name, get average score, input score methods.</p>
 * 
 * @author TIET, KIET
 * @version 1.0
 */
public class Student {
    /**
     * Input the value.
     */
    private Scanner scan;

    /**
     * Student name.
     */
    private String name;

    /**
     * Score for test 1.
     */
    private int score1;

    /**
     * Score for test 2.
     */
    private int score2;


    /**
     * Default constructor.
     */
    public Student() {
        scan = new Scanner(System.in);
        name = "";
        score1 = 0;
        score2 = 0;
    }

    /**
     * Constructor with parameters.
     * 
     * @param name the name of the student.
     */
    public Student(String name) {
        this.name = name;
        scan = new Scanner(System.in);
    }

    /**
     * Get student method.
     * 
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Input grades method.
     */
    public void inputGrades() {
        System.out.println("Enter student's score for test 1: ");
        score1 = scan.nextInt();
        System.out.println("Enter student's score for test 2: ");
        score2 = scan.nextInt();
    }

    /**
     * Calculate and get the average score method.
     * 
     * @return the average score.
     */
    public double getAverage() {
        return (score1 + score2) / 2.0;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [name=" + name + ", score1=" + score1 + ", "
                + "score2=" + score2 + "]";
    }

}
