/**
 * 
 */
package p6;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Shop.java.
 * @author KenTiet
 * @version 1.0
 *
 */
public class Shop {

    /**
     * The main method that drives that program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        //Local variable
        Item item;
        String itemName;
        double itemPrice;
        int itemQuantity;
        double totalPrice;
        String continueShopping;
        
        
        //Create the array list
        ArrayList<Item> cart = new ArrayList<Item>();
        
        //Scanner to get to input
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter the name of the item: ");
            itemName = scan.next();
            System.out.println("Enter the price of the item: ");
            itemPrice = scan.nextDouble();
            System.out.println("Enter the quantity of the item: ");
            itemQuantity = scan.nextInt();
            
            //add the item information
            item = new Item(itemName, itemPrice, itemQuantity);
            cart.add(item);
            
            totalPrice = 0.0;
            for (Item itemInCart : cart) {
                System.out.println(itemInCart);
                totalPrice += itemInCart.getPrice() * itemInCart.getQuantity();
            }
            System.out.println(totalPrice);
                
            //Print out the result
            System.out.println("Do you want to continue shopping (y/n): ");
            continueShopping = scan.next();

        } while (continueShopping.equals("y"));
        scan.close();

        
        

    }

}
