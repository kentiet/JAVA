package q4;

import java.util.Scanner;

/**
 * <p>
 * Primes.java
 * This program is going to determine the prime number 
 * in the boolean array with the size inserted from the user.
 * </p>
 *
 * @author TIET, KIET
 * @version 1.0
 */
public class Primes {

    /**
     * The boolean array of prime numbers.
     */
    private boolean[] primes;

    /**
     * The upper bound of the array.
     */
    private int upperBound;

    /**
     * Primes constructor with one parameter.
     * 
     * @param upperBound
     *            the boundary of the array.
     *            
     * @throw IllegalArgumentException 
     *             if the upper bound is negative            
     */
    public Primes(int upperBound) {
        if (upperBound < 0) {
            throw new IllegalArgumentException("Invalid input, "
                    + "upper bound must be positive digit");
        }
        this.upperBound = upperBound;
        primes = new boolean[upperBound + 1];
    }

    /**
     * Calculate the number whether it is a prime numner.
     */
    public void calculatePrimes() {
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i * 2; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }
    }

    /**
     * Print prime numbers.
     */
    public void printPrimes() {
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Count the amount of the prime number.
     * 
     * @return the amount of prime number.
     */
    public int countPrimes() {
        int count = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                count = count + 1;
            }
        }
        return count;
    }

    /**
     * Define whether x is prime number in the ranger of the array.
     * 
     * @param x
     *            integer input from users
     * @return true if x is prime number and in range of the array.
     */
    public boolean isPrime(int x) {
        return x >= 2 && x <= upperBound && primes[x];

    }

    /**
     * <p>
     * This is the main method (entry point) that drives the program.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        
        int upperBound;
        
        // Prompt the input
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.println("What is the length of the primes?");
            upperBound = scan.nextInt();
            
            //Create primes object
            Primes newPrime = new Primes(upperBound);
            
            //Calculate primes number
            newPrime.calculatePrimes();
            
            System.out.println("\nThe number of prime numbers: " 
                + newPrime.countPrimes() + "\n");
            
            //Print out the result
            System.out.println("The prime numbers between 0 and " 
                + upperBound + " are:");
            newPrime.printPrimes();
        
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        
        System.out.println("Question four was called and ran sucessfully.");
        scan.close();
    }

};
