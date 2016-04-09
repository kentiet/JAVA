/**
 * 
 */
package q1;

/**
 * @author KenTiet
 *
 */
public class DogTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Labrador lab = new Labrador("LuLu", "Brown");
        System.out.println(lab.getName() + " says " + lab.speak());
        Yorkshire yorkshire = new Yorkshire("Yorky");
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
        System.out.println("The average breedweight of labrador is "
                + lab.avgBreedWeight());
        System.out.println("The average breedweight of yorkshire is "
                + yorkshire.avgBreedWeight());

    }

}
