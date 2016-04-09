package q1;
import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Statistics {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int initialsize = 50;
        final int col = 5; // the number of invalid input be printed each row
        int[] num = new int[initialsize]; // input numbers
        String[] invalidInput = new String[initialsize]; // invalid input string
        int count = 0; // how many input numbers
        int invalidcount = 0; // how many invalid inputs
        int sum = 0;
        float sqrtsum = 0;
        float mean;
        float sd;
        boolean keepdoing = true;
        String s;
        Scanner scan = new Scanner(System.in);
        System.out
                .println("Please enter the integer with space between them: ");
        System.out.println("(note:Type \"end\" to stop inputing,every"
                + " non-integer element will be ignored.)");
        while (keepdoing) {
            s = scan.next();
            if (s.equalsIgnoreCase("end")) {
                keepdoing = false;
            } else {
                try {
                    num[count] = Integer.parseInt(s);
                    sum += num[count];
                    count++;
                } catch (NumberFormatException e) {
                    invalidInput[invalidcount] = s;
                    invalidcount++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No input.");
        } else {
            mean = (float) sum / count;
            for (int i = 0; i < count; i++) {
                sqrtsum += Math.pow(num[i] - mean, 2);
            }
            sd = (float) Math.sqrt(sqrtsum / (count - 1));
            System.out.println("You entered " + count + " numbers.");
            System.out.println("Their mean is " + mean + ".");
            System.out.println("Their standard deviation is " + sd + ".");
            if (invalidcount != 0) {
                System.out.println("Invalid input list:");
                for (int i = 1; i <= invalidcount; i++) {
                    System.out.print(invalidInput[i - 1]
                            + ((i % col == 0) ? "\n" : "\t"));
                }
            }
        }
        System.out.println("Question one was called and ran sucessfully.");
    }

};
