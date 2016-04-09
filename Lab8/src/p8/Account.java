package p8;

/**
 * Account.java.
 * @author KenTiet
 * @version 1.0
 */
public class Account {
    
    /**
     * Account balance.
     */
    private double balance;
    
    /**
     * Account name.
     */
    private String name;
    
    /**
     * Account ID.
     */
    private long acctNum;
    
    /**
     * Constructor with 4 parameters.
     * @param initBal original balance.
     * @param owner account owner.
     * @param number acount number.
     */
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    
    /**
     * Constructor with 2 parameters.
     * @param initBal original balance.
     * @param owner account owner.
     */
    public Account(double initBal, String owner) {
        balance = initBal;
        name = owner;
    }
    
    /**
     * Constructor with 1 parameters.
     * @param owner account owner.
     */
    public Account(String owner) {
        name = owner;
    }
    
    /**
     * Withdraw method.
     * @param amount the amount of withdraw
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    /**
     * Withdraw method.
     * @param amount the amount of withdraw
     * @param fee the withdrawing fee
     */
    public void withdraw(double amount, double fee) {
        if (balance > (amount + fee)) {
            balance -= (amount + fee);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    /**
     * Deposit method.
     * @param amount the amount of deposit money
     */
    public void deposit(double amount) {
        balance += amount;
    }
    
    /**
     * Get balance method.
     * @return balance.
     */
    public double getBalance() {
        return balance;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Account [name=" + name + ", acctNum=" + acctNum 
                        + ", balance=" + balance + "]";
    }
    
    
}
