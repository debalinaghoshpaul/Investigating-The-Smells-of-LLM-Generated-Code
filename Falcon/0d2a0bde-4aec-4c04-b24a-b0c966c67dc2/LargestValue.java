import java.util.Scanner;

public class LargestValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the two integer values from the user
        System.out.print("Input the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = input.nextInt();

        // Find the largest value
        int largestValue = Math.max(firstNumber, secondNumber);

        // Check if the two values are the same
        if (firstNumber == secondNumber) {
            System.out.println("Result: 0");

            // Find the smallest value if the two values have the same remainder when divided by 6
            if (firstNumber % 6 == secondNumber % 6) {
                int smallestValue = Math.min(firstNumber, secondNumber);
                System.out.println("Smallest value: " + smallestValue);
            }
        } else {
            System.out.println("Result: " + largestValue);
        }
    }
}
