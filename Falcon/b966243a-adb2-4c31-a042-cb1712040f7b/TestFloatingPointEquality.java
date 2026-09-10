import java.util.Scanner;

public class TestFloatingPointEquality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two floating-point numbers from the user.
        System.out.println("Input floating-point number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Input floating-point another number: ");
        double number2 = scanner.nextDouble();

        // Compare the two numbers up to three decimal places.
        boolean areEqual = Math.abs(number1 - number2) < 0.001;

        // Print the result.
        if (areEqual) {
            System.out.println("They are the same.");
        } else {
            System.out.println("They are different.");
        }
    }
}
