import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read an integer from the user
            System.out.println("Enter an integer: ");
            int number = scanner.nextInt();

            // Divide the number by 0
            int result = number / 0;

            // Print the result
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException and print an error message
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
