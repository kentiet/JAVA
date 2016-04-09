/**
 * 
 */
package p7;
import java.util.Random;
/**
 * Account.java.
 * @author KenTiet
 * @version 1.0
 */
public class Account {
    
    /**
     * Balance of the account.
     */
    private double balance;
    
    /**
     * The account number.
     */
    private long accID;
    
    /**
     * The numbers of the created account.
     */
    private static int numAccounts = 0;
    
    /**
     * Name of the owner.
     */
    private String owner;
    
    
    /**
     * Constructor with 3 parameters.
     * @param owner owner of the account.
     * @param balance balance of the account.
     * @param accID the ID of the account.
     */
    public Account(String owner, double balance, long accID) {
        this.owner = owner;
        this.balance = balance;
        this.accID = accID;
        numAccounts++;
    }
    
    
    /**
     * Constructor with 2 parameters.
     * @param owner owner of the account.
     * @param balance balance of the account.
     */
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        Random generator = new Random();
        accID = generator.nextLong();
    }
    
    /**
     * Constructor with a parameter.
     * @param owner owner of the account.
     */
    public Account(String owner) {
        this.owner = owner;
        Random generator = new Random();
        accID = generator.nextLong();
    }
    
    /**
     * Get owner name.
     * @return onwer of the account.
     */
    public String getName() {
        return owner;
    }
    /**
     * Get balance.
     * @return balance of the account.
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Get account number.
     * @return account number.
     */
    public long getAccNum() {
        return accID;
    }
    
    /**
     * Withdraw method.
     * @param withDrawAmount the amount of withdraw.
     */
    public void withdraw(double withDrawAmount) {
        if (balance > withDrawAmount) {
            balance -= (withDrawAmount);
        } else {
            System.out.println("The request cannot be processed");
        }
        
    }
    
    /**
     * Deposit method
     * @param depositAmount the amount of deposit
     */
    public void deposit(double depositAmount) {
        balance += depositAmount;
        
    }
    
    /**
     * Get numbers of accounts.
     * @return the created accounts.
     */
    public static int getNumAccounts() {
        return numAccounts;
    }
    
    /**
     * Close account method.
     */
    public void close() {
        owner += " CLOSED";
        balance = 0.0;
        numAccounts--;
    }
    
    /**
     * Consolidating account method.
     * @param acct1 the first account
     * @param acct2 the second account
     * @return the new account is the result of the consolidation.
     */
    public static Account consolidate(Account acct1, Account acct2) {
        if (acct1.getAccNum() == acct2.getAccNum()) {
            System.out.println("These accounts have the SAME ACCOUNT ID "
                    + "cannot be consolidated");
            return null;
        } else {
            if (acct1.getName().equals(acct2.getName())) {
                Account newAcc = new Account(acct1.getName(), 
                        acct1.getBalance() + acct2.getBalance());
                acct1.close();
                acct2.close();
                return newAcc;
            } else {
                System.out.println("These accounts cannot be consolidated");
                return null;
            }
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Account [owner=" + owner + ", balance=" + balance 
                + ", accID=" + accID + "]";
    }


    
    
    
    
}
