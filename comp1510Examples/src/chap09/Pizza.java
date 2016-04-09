package chap09;

/**
 * Represents a pizza, which is a food item. Used to demonstrate
 * indirect referencing through inheritance.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Pizza extends FoodItem {

    /** Number of servings in a pizza. */
    public static final int PIZZA_SERVINGS = 8;

    /**
    * Sets up a pizza with the specified amount of fat (assumes
    * eight servings).
    * @param fatGrams Number of grams of fat in whole pizza
    */
    public Pizza(int fatGrams) {
        super(fatGrams, PIZZA_SERVINGS);
    }
    
    /**
     * Pathological declaration of accessor which should be defined in parent.
     * Possible to do this because servings is protected.
     * @return number of servings
     */
    public int getServings() {
        return servings;
    }
}
