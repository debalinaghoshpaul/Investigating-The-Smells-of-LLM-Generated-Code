import java.util.Scanner;

public class SumOfPrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of prime numbers to sum
        System.out.print("Enter the number of prime numbers to sum: ");
        int numPrimes = scanner.nextInt();

        // Initialize the sum to 0
        int sum = 0;

        // Iterate over the prime numbers and add them to the sum
        int count = 0;
        int number = 2;
        while (count < numPrimes) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        // Print the sum of the prime numbers
        System.out.println("Sum of the first " + numPrimes + " prime numbers: " + sum);
    }

    /**
     * Checks if a number is prime.
     *
     * @param number The number to check
     * @return True if the number is prime, false otherwise
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
