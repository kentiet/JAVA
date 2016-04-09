package chap10;

import java.io.File;
import static java.io.File.separator;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents the personnel staff of a particular business.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Staff {
    /** Holds all employees in business. */
    private List<StaffMember> staffList;

    /**
    * Constructor: Sets up the list of staff members, read from a file.
    * The file staff.txt has one line per staff member.
    * The first word is the staff class, the fields to initialize follow
    * on the same line.  Fields are separated by tabs.
    * This is quite different from the text example, which is full of magic
    * numbers.
    * The example shows one way to push magic numbers out to a file where
    * they cease being a problem.
    */
    public Staff() {
        final double executiveBonus = 500.00;
        final int hourlyHours = 40;
        staffList = new ArrayList<StaffMember>();
        StaffMember nextStaff;
        Scanner scan;
        try {
            scan = new Scanner(new File("chap10" + separator + "staff.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("could not find staff.txt");
            return;
        }
        scan.useDelimiter("[\t\n]");

        while (scan.hasNext()) {
            String className = scan.next();
            try {
                //create instance of staff member's class
                nextStaff = (StaffMember) Class.forName(className)
                        .newInstance();

                //The instance initializes itself from the file
                nextStaff.readInstanceData(scan);

                //Add to list, add bonus and hours as in text example
                staffList.add(nextStaff);
                if (nextStaff instanceof Executive) {
                    ((Executive) nextStaff).awardBonus(executiveBonus);
                }
                if (nextStaff instanceof Hourly) {
                    ((Hourly) nextStaff).addHours(hourlyHours);
                }

                //Now deal with what can go wrong if the file is bad
            } catch (ClassNotFoundException ex) {
                System.out
                        .println("Could not find class \"" + className + "\"");
                return;
            } catch (InstantiationException ex) {
                System.out.println("Class " + className
                        + " cannot be instantiated");
                return;
            } catch (IllegalAccessException ex) {
                System.out.println("Definition for class " + className
                        + " cannot be accessed.");
                return;
            }
        }
    }

    /**
    * Pays all staff members.
    */
    public void payday() {
        double amount;

        for (StaffMember staff : staffList) {
            System.out.println(staff);

            amount = staff.pay(); // polymorphic

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }

            System.out.println("-----------------------------------");
        }
    }
}
