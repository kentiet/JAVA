/**
 * 
 */
package p8;
import java.util.Scanner;
/**TestAccount.java.
 * @author KenTiet
 * @version 1.0
 */
public class TestAccount {

    /**Drives the program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        String name;
        double balance;
        long accNum;
        Account acct;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter account holder's first name");
        name = scan.next();
        acct = new Account(name);
        System.out.println("Account for " + name + ":");
        System.out.println(acct);
        
        System.out.println("\nEnter initial balance");
        balance = scan.nextDouble();
        acct = new Account(balance, name);
        System.out.println("Account for " + name + ":");
        System.out.println(acct);

        System.out.println("\nEnter account number");
        accNum = scan.nextLong();
        acct = new Account(balance, name, accNum);
        System.out.println("Account for " + name + ":");
        System.out.println(acct);
        
        System.out.println("\nDepositing 100 into account, balance in now");
        acct.deposit(100);
        System.out.println(acct.getBalance());
        System.out.println("\nWithdrawing $25, balance is now");
        acct.withdraw(25);
        System.out.println(acct.getBalance());
        System.out.println("\nWithdrawing $25 with $2, balance is now");
        acct.withdraw(25, 2);
        System.out.println(acct.getBalance());
        
        System.out.println("\nBye");
        scan.close();
    }

}
