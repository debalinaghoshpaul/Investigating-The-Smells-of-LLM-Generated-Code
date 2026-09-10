import java.util.Scanner;

public class StrictlyBetween0And1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number
        System.out.println("Input first number: ");
        double firstNumber = scanner.nextDouble();

        // Read the second number
        System.out.println("Input second number: ");
        double secondNumber = scanner.nextDouble();

        // Check if both numbers are strictly between 0 and 1
        boolean bothStrictlyBetween0And1 = firstNumber > 0 && firstNumber < 1 && secondNumber > 0 && secondNumber < 1;

        // Print the result
        System.out.println(bothStrictlyBetween0And1);
    }
}
