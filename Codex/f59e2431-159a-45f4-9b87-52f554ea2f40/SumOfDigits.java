import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input integer
        System.out.println("Input an integer:");
        int number = scanner.nextInt();

        // Compute the sum of digits
        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        // Print the result
        System.out.println("The sum is " + sumOfDigits);
    }
}
