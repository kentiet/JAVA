package chap04;

/**
 * Demonstrates the creation and use of multiple Account objects.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Transactions {
    /** fee for a single withdrawal. */
    public static final double WITHDRAWAL_FEE = 1.50;
    /**
     * Creates some bank accounts and requests various services.
     * @param args unused
     */
    public static void main(String[] args) {
        final Account acct1 = new Account("Ted Murphy", 72354, 102.56);
        final Account acct2 = new Account("Jane Smith", 69713, 40.00);
        final Account acct3 = new Account("Edward Demsey", 93757, 759.32);

        final double murphyDeposit = 25.85;
        acct1.deposit(murphyDeposit);

        final double smithBalance = acct2.deposit(500.00);
        System.out.println("Smith balance after deposit: " + smithBalance);

        final double smithWithDrawal = 430.75;
        System.out.println("Smith balance after withdrawal: "
                + acct2.withdraw(smithWithDrawal, WITHDRAWAL_FEE));

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}
