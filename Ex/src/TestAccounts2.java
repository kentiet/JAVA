import java.util.Scanner;
public class TestAccounts2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account acct1;
        Account acct2;
        Account acct3;
        Account acct4;
        System.out.println("Enter three names (press enter after each): ");
        acct1 = new Account(100, scan.nextLine());
        acct2 = new Account(100, scan.nextLine());
        acct3 = new Account(100, scan.nextLine());
        
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
        
        acct1.close();
        acct4 = Account.consolidate(acct2, acct3);
        
        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
        System.out.println(acct4);
    }
}
