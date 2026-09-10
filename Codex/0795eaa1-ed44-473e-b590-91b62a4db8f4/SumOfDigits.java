import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input integer
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();

        // Compute the sum of the digits
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // Print the result
        System.out.println("The sum of the digits is: " + sum);
    }
}
