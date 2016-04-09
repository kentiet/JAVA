/**
 * 
 */
package q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * SquareTest.java.
 * 
 * @author KenTiet
 * @version 1.0
 */
public class SquareTest {

    /**
     * Drives the program.
     * 
     * @param args
     *            command line arguments.
     * @throws IOException
     *             for scanning external file.
     */
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("src/q3/magicData.txt"));
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int row;
        int col;
        int size = scan.nextInt();

        while (size != -1) {
            Square square = new Square(size);
            square.readSquare(scan);
            System.out.println("\n****** Square " + count + " ******");
            square.printSquare();

            System.out.println("Enter row");
            row = sc.nextInt();
            System.out.println("The sums of row " + row + " is: " 
                    + square.sumRow(row));

            System.out.println("Enter column");
            col = sc.nextInt();
            System.out.println("The sums of col " + col + " is: " 
                    + square.sumCol(col));
            System.out.println("Sum of main diagonal: " + square.sumMainDiag());
            System.out.println("Sum of other diagonal: " 
                    + square.sumOtherDiag());
            System.out.println("Is this a magic square?" + square.magic());
            size = scan.nextInt();
            count++;
        }
        sc.close();

    }

}
