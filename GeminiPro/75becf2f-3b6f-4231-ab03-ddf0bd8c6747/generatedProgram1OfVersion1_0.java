import java.util.Scanner;

public class Expressions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the values of the variables
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        // Compute the expression
        double result = ((a * b) - (c * c)) / (d - c);

        // Print the result
        System.out.println(result);
    }
}
