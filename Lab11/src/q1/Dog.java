/**
 * 
 */
package q1;

/**
 * @author KenTiet
 *
 */
public abstract class Dog {
    protected String name;

    
    public Dog(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    public String speak() {
        return "Woof";
    }

    public abstract int avgBreedWeight();
}
