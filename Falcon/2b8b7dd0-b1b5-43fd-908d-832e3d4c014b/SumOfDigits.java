import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer between 0 and 1000
        System.out.println("Input an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        // Check if the number is valid
        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter an integer between 0 and 1000.");
            return;
        }

        // Add all the digits in the integer
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        // Print the sum of all digits
        System.out.println("The sum of all digits in " + number + " is " + sum);
    }
}
