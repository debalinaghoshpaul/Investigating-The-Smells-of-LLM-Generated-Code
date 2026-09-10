import java.util.Scanner;

public class FibonacciChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Fibonacci number
        boolean isFibonacci = isFibonacci(number);

        // Print the result
        if (isFibonacci) {
            System.out.println(number + " is a Fibonacci number.");
        } else {
            System.out.println(number + " is not a Fibonacci number.");
        }
    }

    public static boolean isFibonacci(int number) {
        // Check if the number is 0 or 1
        if (number == 0 || number == 1) {
            return true;
        }

        // Initialize the Fibonacci sequence
        int a = 0;
        int b = 1;

        // Iterate until the Fibonacci sequence reaches the number
        while (b < number) {
            // Update the Fibonacci sequence
            int c = a + b;
            a = b;
            b = c;
        }

        // Check if the number is in the Fibonacci sequence
        return b == number;
    }
}
