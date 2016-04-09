package p9;

import java.util.Scanner;

/**
 * Sales.java.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class Sales {

    /**
     * Drives programs.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int salespeople;
        int sum;
        int amount;
        int indexMax = 0;
        int indexMin = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many salespeople are there in the company: ");
        salespeople = scan.nextInt();

        int[] sales = new int[salespeople];

        for (int i = 0; i < sales.length; i++) {
            System.out.println("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");

        sum = 0;

        int max = sales[0];
        int min = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
                indexMax = i;
            } else if (sales[i] < min) {
                min = sales[i];
                indexMin = i;
            }
            System.out.println("  " + i + "  " + sales[i]);
            sum += sales[i];
        }

        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nThe average sales: " + (sum / 5));
        System.out.println("\nSalesperson " + (indexMin + 1) + " had the highest sale with $" + min);
        System.out.println("\nSalesperson " + (indexMax + 1) + " had the lowest sale with $" + max);

        System.out.println("Enter the standard amount: ");
        amount = scan.nextInt();

        System.out.println("The salesperson who exceed the sales are number: ");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amount) {
                System.out.print((i + 1) + "\t");
            }
        }
    }

}
