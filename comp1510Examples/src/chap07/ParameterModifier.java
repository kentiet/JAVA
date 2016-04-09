package chap07;

/**
 * Demonstrates the effects of changing parameter values.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class ParameterModifier {
    /** Test value 777. */
    private static final int T777 = 777;

    /** Test value 888. */
    private static final int T888 = 888;

    /** Test value 999. */
    private static final int T999 = 999;

    // -----------------------------------------------------------------
    // Modifies the parameters, printing their values before and
    // after making the changes.
    // -----------------------------------------------------------------
    /**
     * Modifies the parameters, printing their values before and
     * after making the changes.
     * @param f1 primitive value to be replaced
     * @param f2 object to be changed
     * @param f3 object to be replaced
     */
    public void changeValues(int f1, Num f2, Num f3) {
        System.out.println("Before changing the values:");
        System.out.println("f1\tf2\tf3");
        System.out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");

        f1 = T999;
        f2.setValue(T888);
        f3 = new Num(T777);

        System.out.println("After changing the values:");
        System.out.println("f1\tf2\tf3");
        System.out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");
    }
}
