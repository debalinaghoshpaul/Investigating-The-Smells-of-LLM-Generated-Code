import java.util.Scanner;

public class SumOfTwoIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number
        System.out.println("Input the first number : ");
        int firstNumber = scanner.nextInt();

        // Read the second number
        System.out.println("Input the second number: ");
        int secondNumber = scanner.nextInt();

        // Read the third number
        System.out.println("Input the third number : ");
        int thirdNumber = scanner.nextInt();

        // Calculate the sum of the first two numbers
        int sum = firstNumber + secondNumber;

        // Check if the sum is equal to the third number
        boolean result = sum == thirdNumber;

        // Print the result
        System.out.println("The result is: " + result);
    }
}
