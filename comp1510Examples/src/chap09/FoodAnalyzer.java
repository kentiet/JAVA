package chap09;

/**
 * Demonstrates indirect access to inherited private members.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class FoodAnalyzer {
    /**
    * Instantiates a Pizza object and prints its calories per
    * serving.
    * @param args Unused
    */
    public static void main(String[] args) {
        final Pizza special = new Pizza(275);
        
        //invalidates standard number of servings:
        special.servings++;
        System.out.println("Calories per serving: "
                + special.caloriesPerServing() + " servings = "
                + special.servings);
    }
}
