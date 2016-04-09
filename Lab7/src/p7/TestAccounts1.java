/**
 * 
 */
package p7;
import java.util.Scanner;
/**
 * TestAccounts1 is  the driver of the Account.java.
 * @author KenTiet
 * @version 1.0
 */
public class TestAccounts1 {

    /**Drives the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // The initial balance
        final int INIT_BALANCE = 100;
        
        //First account
        String firstAccName;
        
        //Second account
        String secondAccName;
        
        //Third account
        String thirdAccName;
        
        Scanner scan = new Scanner(System.in);
        
        // Get the name of the accounts
        System.out.println("Enter the name for the first account: ");
        firstAccName = scan.nextLine();
        System.out.println("Enter the name for the second account: ");
        secondAccName = scan.nextLine();
        System.out.println("Enter the name for the third account: ");
        thirdAccName = scan.nextLine();
        
        // Instantiate the objects
        Account accountOne = new Account(firstAccName, INIT_BALANCE);
        Account accountTwo = new Account(secondAccName, INIT_BALANCE);
        Account accountThree = new Account(thirdAccName, INIT_BALANCE);
        
        // Print out the result.
        System.out.println(accountOne + "\n");
        System.out.println(accountTwo + "\n");
        System.out.println(accountThree + "\n\n");
        
        accountOne.close();
        System.out.println("The consolidated account: ");
        System.out.println(Account.consolidate(accountTwo, 
                accountThree) + "\n\n");
        
        System.out.println(accountOne + "\n");
        System.out.println(accountTwo + "\n");
        System.out.println(accountThree + "\n");
        scan.close();
        
        
        /*Account testAcct;
        int num;
        
        
        
        System.out.println("How many accounts would you like to create");
        num = scan.nextInt();
        
        for(int i = 1; i <= num; i++) {
            testAcct = new Account("Name", 100, i);
            testAcct.setName();
            System.out.println("\nCreate account " + testAcct);
            System.out.println("There are " + Account.getNumAccounts() + " accounts");
        }*/
        
        
        
        
        
        
    
    }
}
