package chap04;

import java.text.NumberFormat;

/**
 * Represents a bank account with basic services such as deposit
 * and withdraw.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Account {
    /** Interest rate of 3.5. */
    private static final double RATE = 0.035;

    /** Account number, 0 .. 99999 */
    private long acctNumber;
    
    /** Balance in Canadian $. */
    private double balance;
    
    /** Name of account owner.  Format: first name, last name. */
    private String name;

    /**
     * Sets up the account by defining its owner, account number,
     * and initial balance.
    * @param owner name of account owner
    * @param account account number
    * @param initial initial balance in account
    */
    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    /**
     * Deposits the specified amount into the account. Returns the
     * new balance.
     * @param amount The amount to be deposited
     * @return The new balance after the deposit
     */
    public double deposit(double amount) {
        balance = balance + amount;

        return balance;
    }

    /**
     * Withdraws the specified amount from the account and applies
     * the fee. Returns the new balance.
     * @param amount The amount to withdraw
     * @param fee The fee for a withdrawal
     * @return The balance after the withdrawal
     */
    public double withdraw(double amount, double fee) {
        balance = balance - amount - fee;

        return balance;
    }

    /**
     * Adds interest to the account and returns the new balance.
     * @return The amount after the interested is added
     */
    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }

    /**
     * Returns the current balance of the account.
     * @return The current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns a one-line description of the account as a string.
     * @return String containing account number, owner name, balance separeted
     *  with tabs.
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}
