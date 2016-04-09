/**
 * 
 */
package q5;

/**
 * The tester for the name.java class.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class TestName {

    /**
     * The main method drives the programs.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        // Create name 1 and name 2 objects.
        Name name1 = new Name(" ", " ", " ");
        Name name2 = new Name(" ", " ", " ");
        
        //Input name
        name1.inputName();
        name2.inputName();

        // Print out the result
        System.out.println(name1.toString());
        System.out.println("The first, middle, and last name is: " 
                + name1.firstMiddleLast());
        System.out.println("The last, first, and middle name is: " 
                + name1.lastFirstMiddle());
        System.out.println("The initial of name 1: " 
                + name1.initials());
        System.out.println("The length of the name 1: " 
                + name1.length());
        System.out.println();
        System.out.println(name2);
        System.out.println("The first, middle, and last name is: " 
                + name2.firstMiddleLast());
        System.out.println("The last, first, and middle name is: " 
                + name2.lastFirstMiddle());
        System.out.println("The initial of name 2: " + name2.initials());
        System.out.println("The length of the name 2: " + name2.length());
        System.out.println();
        System.out.println("The comparision between name 1 and name 2 is: " 
                + name1.equals(name2));

    }

}
