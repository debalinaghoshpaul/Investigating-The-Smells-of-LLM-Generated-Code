import java.util.Scanner;

public class PrimePosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input prime number
        System.out.println("Enter the prime number: ");
        int primeNumber = scanner.nextInt();

        // Initialize the count of prime numbers found so far
        int count = 0;

        // Iterate through the numbers starting from 2
        int number = 2;
        while (count < primeNumber) {
            // Check if the number is prime
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, increment the count
            if (isPrime) {
                count++;
            }

            // Move to the next number
            number++;
        }

        // Print the position of the prime number
        System.out.println("The position of the prime number " + primeNumber + " is: " + count);
    }
}
