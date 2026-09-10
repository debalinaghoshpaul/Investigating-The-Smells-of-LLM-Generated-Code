import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two numbers from the user
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = firstNumber + secondNumber;

        // Print the sum of the two numbers
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
