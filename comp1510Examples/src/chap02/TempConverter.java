package chap02;

/**
 * Demonstrates the use of primitive data types and arithmetic
 *  expressions.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class TempConverter {
    /**
     * Computes the Fahrenheit equivalent of a specific Celsius
     * value using the formula F = (9/5)C + 32.
     * @param args unused
     */
    public static void main(String[] args) {
        final int base = 32;
        final double conversionFactor = 1.8;

        double fahrenheitTemp;
        final int celsiusTemp = 24; // value to convert

        fahrenheitTemp = celsiusTemp * conversionFactor + base;

        System.out.println("Celsius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
    }
}
