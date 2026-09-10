import java.util.Scanner;

public class CountPrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input from the user.
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Initialize the count of prime numbers.
        int count = 0;

        // Iterate over all the numbers from 2 to the given number.
        for (int i = 2; i <= number; i++) {
            // Check if the number is prime.
            boolean isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, increment the count.
            if (isPrime) {
                count++;
            }
        }

        // Print the count of prime numbers.
        System.out.println("The number of prime numbers less than " + number + " is " + count);
    }
}
