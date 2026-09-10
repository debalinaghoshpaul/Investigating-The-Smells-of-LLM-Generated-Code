import java.util.Scanner;

public class AddNumbersWithoutArithmeticOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two numbers from the user
        System.out.println("Enter the first number:");
        int x = scanner.nextInt();

        System.out.println("Enter the second number:");
        int y = scanner.nextInt();

        // Initialize the sum to 0
        int sum = 0;

        // Add the two numbers using bitwise operators
        while (y != 0) {
            // Add the carry to the sum
            sum = sum + carry;

            // Add the two numbers without the carry
            x = x + y - carry;

            // Calculate the carry
            carry = (x & y) << 1;
        }

        // Print the sum of the two numbers
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
