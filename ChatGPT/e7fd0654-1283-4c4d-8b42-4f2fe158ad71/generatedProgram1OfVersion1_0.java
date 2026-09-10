import java.util.Scanner;

public class ExponentialTaylorSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the base and exponent from the user
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate e^x using the Taylor series
        double result = 1;
        for (int i = 1; i <= exponent; i++) {
            result += Math.pow(base, i) / factorial(i);
        }

        // Print the result
        System.out.println("e^" + exponent + " = " + result);
    }

    // Calculate the factorial of a number
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
