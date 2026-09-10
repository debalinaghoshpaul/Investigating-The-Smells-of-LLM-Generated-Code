import java.util.Scanner;

public class MultiplyWithoutOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the two integers from the user
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        // Initialize the result to 0
        int result = 0;

        // Iterate over the second number
        for (int i = 0; i < num2; i++) {
            // Add the first number to the result num1 times
            result += num1;
        }

        // Print the result
        System.out.println("Result: " + result);
    }
}
