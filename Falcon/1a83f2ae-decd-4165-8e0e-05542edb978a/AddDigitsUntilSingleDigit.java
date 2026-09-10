import java.util.Scanner;

public class AddDigitsUntilSingleDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Add all the digits of the number until the result has a single digit
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // Print the sum of the digits
        System.out.println("The sum of the digits is: " + sum);
    }
}
