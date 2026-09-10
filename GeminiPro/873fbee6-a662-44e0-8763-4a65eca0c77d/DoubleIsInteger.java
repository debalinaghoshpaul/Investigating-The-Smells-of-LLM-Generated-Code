import java.util.Scanner;

public class DoubleIsInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the double number from the user
        System.out.println("Enter a double number: ");
        double number = scanner.nextDouble();

        // Check if the number is an integer
        boolean isInteger = number == (int) number;

        // Print the result
        System.out.println(isInteger ? "The number is an integer." : "The number is not an integer.");
    }
}
