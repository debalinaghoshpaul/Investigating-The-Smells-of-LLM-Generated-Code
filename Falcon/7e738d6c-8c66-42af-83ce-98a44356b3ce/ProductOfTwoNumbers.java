import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number from the user
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        // Read the second number from the user
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

        // Calculate the product of the two numbers
        int product = firstNumber * secondNumber;

        // Display the product of the two numbers
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);

        // Close the scanner object
        scanner.close();
    }
}
