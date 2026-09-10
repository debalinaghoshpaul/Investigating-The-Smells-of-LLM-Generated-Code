import java.util.Scanner;

public class PolynomialEvaluation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the polynomial coefficients and the value of x
        System.out.print("Enter the polynomial coefficients (separated by spaces): ");
        String[] coefficients = input.nextLine().split(" ");

        System.out.print("Enter the value of x: ");
        int x = input.nextInt();

        // Evaluate the polynomial using Horner's method
        int result = 0;
        for (int i = coefficients.length - 1; i >= 0; i--) {
            result = result * x + Integer.parseInt(coefficients[i]);
        }

        // Print the result
        System.out.println("The result is: " + result);
    }
}
