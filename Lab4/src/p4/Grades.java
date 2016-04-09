/**
 * 
 */
package p4;

/**<p>
 * Grades is the java class that drive the tester of the Student application.
 * In this program, the user need to input the score for two students and get
 * the average score for those two student.</P>
 * @author TIET, KIET
 * @version 1.0
 */
public class Grades {

    /**
     * The main method drive the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        //Create student objects
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");
        
        //input value for student 1
        student1.inputGrades();
        
        //Get the result for student 1
        System.out.println("Student 1: " + student1);
        System.out.println("The average for " + student1.getName() + " is: " 
                + student1.getAverage());
        System.out.println();
        
        //Input value for student 2
        student2.inputGrades();
        
        //Get the result for student 2
        System.out.println("Student 2: " + student2);
        System.out.println("The average for " + student2.getName() + " is: " 
                + student2.getAverage());

    }

}
