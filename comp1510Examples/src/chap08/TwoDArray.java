package chap08;

/**
 * Demonstrates the use of a two-dimensional array.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class TwoDArray {
    /** number of rows. */
    private static final int ROWS = 5;
    /** number of columns. */
    private static final int COLS = 7;
    /** multiplier to use to go to next row. */
    private static final int MULT = 10;

    /**
    * Creates a 2D array of integers, fills it with increasing
    * integer values, then prints them out.
    * @param args Unused
    */
    public static void main(String[] args) {
        int[][] table = new int[ROWS][COLS];

        // Load the table with values
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = row * MULT + col;
            }
        }
        final int[] newRow = {1, 2, 3};
        table[2] = newRow;
        // Print the table
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
