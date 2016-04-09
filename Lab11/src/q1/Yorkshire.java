/**
 * 
 */
package q1;

/**
 * @author KenTiet
 *
 */
public class Yorkshire extends Dog {
    private static int breedWeight = 90;
    public Yorkshire(String name) {
        super(name);
    }

    
    public String speak() {
        return "woof";
    }
    public int avgBreedWeight() {
        return breedWeight;
    }
}
