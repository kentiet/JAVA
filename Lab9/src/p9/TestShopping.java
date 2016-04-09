package p9;

import java.util.Scanner;

/**
 * Test Shopping.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class TestShopping {

    /**
     * Drives the programs.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        int quantity;
        double price;
        String terminate;
        ShoppingCart cart = new ShoppingCart();

        do {
            System.out.println("What do you buy?");
            name = scan.next();
            System.out.println("The quantity of \"" + name + "\" do you buy?");
            quantity = scan.nextInt();
            System.out.println("How much is it per product?");
            price = scan.nextDouble();

            cart.addToCart(name, price, quantity);

            System.out.println(cart);

            System.out.println("Do you want to continue shopping?(y/n)");
            terminate = scan.next();
        } while (terminate.equalsIgnoreCase("y"));
        scan.close();
    }
}
