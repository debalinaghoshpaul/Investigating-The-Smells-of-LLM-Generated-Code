import java.util.Scanner;

public class IntegerToDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input number
        System.out.print("Enter a six-digit non-negative integer: ");
        int number = scanner.nextInt();

        // Check if the number is valid
        if (number < 0 || number > 999999) {
            System.out.println("Invalid input. Please enter a six-digit non-negative integer.");
            return;
        }

        // Break the number into digits
        int[] digits = new int[6];
        for (int i = 5; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Print the digits
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        System.out.println();
    }
}
