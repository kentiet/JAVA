package q2;

import java.util.Scanner;

/**
 * <p>
 * SecondsConvert application will get to value (time) from users in hours,
 * minutes,and seconds form. The purpose of this application is convert the
 * value to seconds form
 * </p>
 *
 * @author TIET, KIET
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>The amount of seconds per hour.</p>
     */
    private static final int SECOND_PER_HOUR = 3600;

    /**
     * <p>The amount of seconds per minutes.</p>
     */
    private static final int SECOND_PER_MIN = 60;

    /**
     * <p>Scan object to get the input value.</p>
     */
    private static Scanner scan = new Scanner(System.in);

    /**
     * <p>
     * This is the main method that executes the program.
     * </p>
     *
     * @param args command line arguments.
     * 
     */
    public static void main(String[] args) {
        // Hours value
        int hours;
        // Minutes value
        int minutes;
        // Seconds value
        int seconds;

        // Get hours, minutes and seconds value
        System.out.println("Enter the time duration in" + " hours, minutes, "
                + "seconds format: ");
        hours = scan.nextInt();
        minutes = scan.nextInt();
        seconds = scan.nextInt();

        // Convert to seconds
        hours = hours * SECOND_PER_HOUR;
        minutes = minutes * SECOND_PER_MIN;

        // Print Result
        System.out.println("The time duration in second form is: " 
                + (hours + minutes + seconds) + " seconds.");
        System.out.println();
        System.out.println("Question two was called and ran sucessfully.");
    }

};
