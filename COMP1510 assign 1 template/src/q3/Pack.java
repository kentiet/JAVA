package q3;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author TIET, KIET
 * @version 1.0
 */
public class Pack {
    
    /**
     * <p>Assign the first character with character 'I'.</p>
     */
    private static final char C1 = 'I';

    /**
     * <p>Assign the second character with character 'F'.</p>
     */
    private static final char C2 = 'F';

    /**
     * <p>Assign the third character with character 'E'.</p>
     */
    private static final char C3 = 'E';

    /**
     * <p>Assign the fourth character with character 'B'.</p>
     */
    private static final char C4 = 'B';

    /**
     * <p>Assign the fifth character with character 'A'.</p>
     */
    private static final char C5 = 'A';
    
    /**
     * <p>The constant value of base.</p>
     */
    private static final int BASE = 56;
    
    /**
     * <p>The exponent value of the value of the fifth character.</p>
     */
    private static final int POW1 = 0;
    
    /**
     * <p>The exponent value of the value of the fourth character.</p>
     */
    private static final int POW2 = 1;

    /**
     * <p>The exponent value of the value of the third character.</p>
     */
    private static final int POW3 = 2;
    
    /**
     * <p>The exponent value of the value of the second character.</p>
     */
    private static final int POW4 = 3;
    
    /**
     * <p>The exponent value of the value of the first character.</p>
     */
    private static final int POW5 = 4;
    /**
     * <p>This is the main method that executes the program.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        // The values of character one.
        int value1 = C1 - 'A' + 1;
        // The values of character two.
        int value2 = C2 - 'A' + 1;
        // The values of character three.
        int value3 = C3 - 'A' + 1;
        // The values of character four.
        int value4 = C4 - 'A' + 1;
        // The values of character five.
        int value5 = C5 - 'A' + 1;
         
        // Remainder variables for decode conversion.
        // The place that hold the last character value
        int remainder1;
        // The place that hold the fourth character value
        int remainder2; 
        // The place that hold the third character value
        int remainder3;
        // The place that hold the second character value
        int remainder4; 
        // The place that hold the first character value
        int remainder5; 
        
        // Calculate the value of the set of characters.
        // totalValue is the sum value of each character of the set characters.
        int totalValue = (int) (value5 * Math.pow(BASE, POW1) + value4 
                * Math.pow(BASE, POW2) + value3 * Math.pow(BASE, POW3) + value2 
                * Math.pow(BASE, POW4) + value1 * Math.pow(BASE, POW5));
        
        // Print out the result
        System.out.println(C1 + "" + C2 + "" + C3 + "" + C4 + "" + C5);
        System.out.println("Encoded: " + totalValue);
        
        // Convert back from integer to characters
        remainder1 = totalValue % BASE;
        totalValue = totalValue / BASE;
        remainder1 = remainder1 + 'A' - 1;
        
        remainder2 = totalValue % BASE;
        totalValue = totalValue / BASE;
        remainder2 = remainder2 + 'A' - 1;
        
        remainder3 = totalValue % BASE;
        totalValue = totalValue / BASE;
        remainder3 = remainder3 + 'A' - 1;
        
        remainder4 = totalValue % BASE;
        totalValue = totalValue / BASE;
        remainder4 = remainder4 + 'A' - 1;
        
        remainder5 = totalValue % BASE;
        totalValue = totalValue / BASE;
        remainder5 = remainder5 + 'A' - 1;
        
        // Print out the decode result
        System.out.println("Decode: " + (char) remainder5 + "" + (char) 
                remainder4 + "" + (char) remainder3 + "" + (char) remainder2 
                + "" + (char) remainder1);
        
        System.out.println("Question three was called and ran sucessfully.");

    }

};
