/**
 * 
 */
package q1;

/**
 * Average.java.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class Average {

    /**
     * Drives the program.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        if (args.length == 0) {
            System.out.println("No arguments");
        } else {
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println(sum / args.length);
        }
    }

}
