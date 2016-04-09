
import java.util.Random;

//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
public class Account {

    public static int numAccounts;

    private Random rand = new Random();
    private double balance;
    private String name;
    private long acctNum;
//-------------------------------------------------
//Constructor -- initializes balance, owner, and account number
//-------------------------------------------------

    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts++;
    }

    public Account(double initBal, String owner) {
        balance = initBal;
        name = owner;
        acctNum = rand.nextInt(9999999) + 1;
        numAccounts++;
    }

    public Account(String owner) {
        balance = 0;
        name = owner;
        acctNum = rand.nextInt(9999999) + 1;
        numAccounts++;
    }
//-------------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
//-------------------------------------------------

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void withdraw(double amount, double fee) {
        if (balance >= (amount + fee)) {
            balance -= (amount + fee);
        } else {
            System.out.println("Insufficient funds");
        }
    }
//-------------------------------------------------
// Adds deposit amount to balance.
//-------------------------------------------------

    public void deposit(double amount) {
        balance += amount;
    }
//-------------------------------------------------
// Returns balance.
//-------------------------------------------------

    public double getBalance() {
        return balance;
    }
//-------------------------------------------------
// Returns a string containing the name, account number, and balance.
//-------------------------------------------------

    @Override
    public String toString() {
        return "Name:" + name
                + "\nAccount Number: " + acctNum
                + "\nBalance: " + balance;
    }

    static int getNumAccounts() {
        return numAccounts;
    }

    static Account consolidate(Account acct1, Account acct2) {
        double sumBalance = acct1.balance + acct2.balance;
        String name = acct1.name;
        if (acct1.name.equals(acct2.name) && acct1.acctNum != acct2.acctNum) {
            acct1.close();
            acct2.close();
            return new Account(sumBalance, name);
        } else {
            System.out.println("Either these two accounts do not share the same name, or two identical account numbers are being used.");
            return null;
        }

    }

    public void close() {
        name = name.concat(" - CLOSED");
        balance = 0;
        numAccounts--;
    }
}
