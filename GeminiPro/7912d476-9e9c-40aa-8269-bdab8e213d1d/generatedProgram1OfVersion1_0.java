import java.util.Scanner;

public class LinearEquationSolver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the coefficients and constants from the user
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        System.out.print("Enter d: ");
        double d = input.nextDouble();
        System.out.print("Enter e: ");
        double e = input.nextDouble();
        System.out.print("Enter f: ");
        double f = input.nextDouble();

        // Calculate the determinant
        double determinant = a * e - b * d;

        // Check if the determinant is zero
        if (determinant == 0) {
            System.out.println("The system is inconsistent.");
        } else {
            // Calculate the values of x and y
            double x = (e * c - b * f) / determinant;
            double y = (a * f - d * c) / determinant;

            // Print the values of x and y
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
