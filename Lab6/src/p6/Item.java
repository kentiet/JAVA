/**
 * 
 */
package p6;

/**
 * Item class.
 * @author KenTiet
 * @version 1.0
 */
public class Item {
    
    /**
     * Name of the item.
     */
    private String name;
    
    /**
     * Price of the item.
     */
    private double price;
    
    /**
     * Quantity of the item.
     */
    private int quantity;
    
    
    /**
     * Default constructor.
     */
    public Item() {
        name = "";
        price = 0.0;
        quantity = 0;
    }
    
    /**
     * Constructor with parameter.
     * @param name  name of the item
     * @param price  price of the item
     * @param quantity  quantity of the item
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Item [name= " + name + ", price= " + price 
                + ", quantity= " + quantity + "]";
    }
    
    /**
     * Get name method.
     * 
     * @return name of item
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Get price method.
     * @return price of the item
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * Get quantity method.
     * @return quantity of item
     */
    public int getQuantity() {
        return this.quantity;
    }
}
