import java.util.Scanner;

public class GoldbachConjecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an even number
        System.out.print("Enter an even number (between 4 and 50,000): ");
        int number = input.nextInt();

        // Check if the number is valid
        if (number < 4 || number > 50000 || number % 2 != 0) {
            System.out.println("Invalid input. Please enter an even number between 4 and 50,000.");
            return;
        }

        // Find all the combinations of two prime numbers that add up to the given number
        int count = 0;
        for (int i = 2; i <= number / 2; i++) {
            if(isPrime(i) && isPrime(number - i)){
                count++;
            }
        }

        // Print the number of combinations
        System.out.println("The number of combinations is: " + count);
    }

    // Check if a number is prime
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
