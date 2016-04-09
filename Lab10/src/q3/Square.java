package q3;

import java.util.Scanner;

/**
 * Square.java.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class Square {

    /**
     * Two Dimenstional Square.
     */
    private int[][] square;

    /**
     * The size of the dimentional.
     */
    private int size;

    /**
     * Constructor with one parameter.
     * 
     * @param size
     *            the size of the dimentional
     */
    public Square(int size) {
        this.size = size;
        square = new int[size][size];
    }

    /**
     * Calculate the sum of row.
     * 
     * @param row
     *            the specific number of row
     * @return the row's sum
     */
    public int sumRow(int row) {
        int sum = 0;
        for (int i = 0; i < square[row].length; i++) {
            sum = sum + square[row][i];
        }
        return sum;
    }

    /**
     * Calculate the sum of column.
     * 
     * @param col
     *            the specific number of column.
     * @return the column's sum
     */
    public int sumCol(int col) {
        int sum = 0;
        for (int i = 0; i < square[col].length; i++) {
            sum = sum + square[i][col];
        }
        return sum;
    }

    /**
     * Calculate the sum of the main diagonal.
     * 
     * @return the sum of the main diagonal.
     */
    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += sum + square[i][i];
        }
        return sum;
    }

    /**
     * Calculate the sum of the other diagonal.
     * 
     * @return the sum of the other diagonal
     */
    public int sumOtherDiag() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += sum + square[i][size - 1 - i];
        }
        return sum;
    }

    /**
     * Determine the magic square.
     * 
     * @return true if square is magic.
     */
    public boolean magic() {
        int sum;
        sum = sumMainDiag();
        if (this.sumOtherDiag() != sum) {
            return false;
        } else {
            for (int i = 0; i < size; i++) {
                if (sumRow(i) != sum && sumCol(i) != sum) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Read the square from user.
     * 
     * @param scan
     *            scan the input.
     */
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    /**
     * Print the square.
     */
    public void printSquare() {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
