import java.util.Scanner;

public class NumberCategorization {

    public static void main(String[] args) {
        // Get the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be categorized:");
        int number = scanner.nextInt();

        // Check if the number is valid
        if (number < 1 || number > 10000) {
            System.out.println("Invalid input. The number must be between 1 and 10,000.");
            return;
        }

        // Calculate the sum of proper divisors
        int sumOfProperDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfProperDivisors += i;
            }
        }

        // Categorize the number
        if (sumOfProperDivisors > number) {
            System.out.println("Abundant number");
        } else if (sumOfProperDivisors < number) {
            System.out.println("Deficient number");
        } else {
            System.out.println("Perfect number");
        }
    }
}
