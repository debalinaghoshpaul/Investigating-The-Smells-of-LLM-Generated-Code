import java.util.*;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input from the user.
        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();

        // Create a boolean array to store the prime numbers.
        boolean[] isPrime = new boolean[limit + 1];

        // Initialize the array to true.
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        // Mark the non-prime numbers.
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print the prime numbers.
        System.out.println("The prime numbers are: ");
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
