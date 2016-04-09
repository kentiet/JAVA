package p9;

import java.text.NumberFormat;

/**
 * ShoppingCart.java.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class ShoppingCart {

    /**
     * The variable that count the item.
     */
    private int itemCount;

    /**
     * Total Price of the cart.
     */
    private double totalPrice;

    /**
     * The cart's capacity.
     */
    private int capacity;

    /**
     * The cart.
     */
    private Item[] cart;

    /**
     * Default constructor.
     */
    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }

    /**
     * addToCart Method.
     * 
     * @param itemName
     *            item's name
     * @param price
     *            item's price
     * @param quantity
     *            item's quantity
     */
    public void addToCart(String itemName, double price, int quantity) {
        if (itemCount == cart.length) {
            increaseSize();
        }

        cart[itemCount] = new Item(itemName, price, quantity);
        totalPrice += price * quantity;
        itemCount++;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String cartContents = "\n~~~~~~~~~~~~~~~~Shopping Cart~~~~~~~~~~~~~~~~";
        cartContents += "\nItem\t\tPrice\t\tQuantity\tTotal\n";
        for (int i = 0; i < itemCount; i++) {
            cartContents += cart[i].toString() + "\n";
        }
        cartContents += "\nTotal Price: " + fmt.format(totalPrice);
        cartContents += "\n";
        return cartContents;
    }

    /**
     * increaseSize method.
     */
    private void increaseSize() {
        Item[] temp = new Item[cart.length + 3];

        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }

        cart = temp;
    }

}
