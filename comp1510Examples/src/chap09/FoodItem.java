package chap09;

/**
 * Represents an item of food. Used as the parent of a derived class
 * to demonstrate indirect referencing.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class FoodItem {
    /** number of calories per gram of fat. */
    public static final int CALORIES_PER_GRAM = 9;

    /** Number of servings per food item. 
     * Should be private, but protected for illustration 
     * Violation of Checkstyle.
     */
    protected int servings;

    /** Number of grams of fat per food item. */
    private int fatGrams;

    /**
    * Sets up this food item with the specified number of fat grams
    * and number of servings.
    * @param numFatGrams number of grams of fat
    * @param numServings number of servings
    */
    public FoodItem(int numFatGrams, int numServings) {
        fatGrams = numFatGrams;
        servings = numServings;
    }

    /**
    * Computes and returns the number of calories in this food item
    * due to fat.
    * @return number of calories due to fat
    */
    private int calories() {
        return fatGrams * CALORIES_PER_GRAM;
    }

    /**
    * Computes the number of fat calories per serving.
    * @return number of calories per serving
    */
    public int caloriesPerServing() {
        return (calories() / servings);
    }

    /**
     * Accessor for fatGrams.
     * @return number of grams of fat in food item
     */
    public int getFatGrams() {
        return fatGrams;
    }
}
