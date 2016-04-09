/**
 * 
 */
package q4;

/**
 * @author TIET, KIET
 *
 */
public class Prime {
    
    private boolean[] primes;
    private int upperBound;
    
    public Prime(int upperBound){
        this.upperBound = upperBound;
        primes = new boolean[upperBound + 1];
    }
    
    
    public void calculatePrimes() {
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }
        
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == true) {
                for (int j = i * 2; j < primes.length; j+=i) {
                //for (int j = 2; j * i < primes.length; j++) {
                    //primes [i*j] = false;
                    primes[j] = false;
                }
            }
            /*
            if (i % 2 == 0) {
                return false;
            }*/
        }
    }
    
    
    public void printPrimes() {
        //String primesNum = "";
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                //primesNum = primesNum + i + " ";
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public int countPrimes() {
        int count = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
               count = count + 1;
            }
        }
        return count;
    }
    
    
    public boolean isPrime(int x) {
        return x >= 2 && x <= upperBound && primes[x] == true;
        
    }
    
}
