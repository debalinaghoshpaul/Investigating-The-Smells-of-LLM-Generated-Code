import java.util.ArrayList;
import java.util.List;

public class TwinPrimes {

    public static List<List<Integer>> findTwinPrimes(int n) {
        // Initialize the list of twin primes.
        List<List<Integer>> twinPrimes = new ArrayList<>();

        // Iterate over all the numbers up to n.
        for (int i = 2; i < n; i++) {
            // Check if the number is prime.
            if (isPrime(i)) {
                // Check if the next number is prime.
                if (isPrime(i + 2)) {
                    // Add the pair of prime numbers to the list of twin primes.
                    twinPrimes.add(List.of(i, i + 2));
                }
            }
        }

        // Return the list of twin primes.
        return twinPrimes;
    }

    public static boolean isPrime(int n) {
        // Check if the number is less than or equal to 1.
        if (n <= 1) {
            return false;
        }

        // Iterate over all the numbers up to the square root of n.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Check if the number is divisible by any of the numbers up to its square root.
            if (n % i == 0) {
                return false;
            }
        }

        // If the number is divisible by none of the numbers up to its square root, then it is prime.
        return true;
    }

    public static void main(String[] args) {
        // Get the list of twin primes less than 100.
        List<List<Integer>> twinPrimes = findTwinPrimes(100);

        // Print the list of twin primes.
        for (List<Integer> twinPrime : twinPrimes) {
            System.out.println(twinPrime);
        }
    }
}
