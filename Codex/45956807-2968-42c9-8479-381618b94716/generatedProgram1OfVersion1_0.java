import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a positive number from the user
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Repeatedly add the digits of the number until the result has only one digit
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;

            if (number == 0 && sum > 9) {
                number = sum;
                sum = 0;
            }
        }

        // Print the result
        System.out.println("The sum of the digits of the number is: " + sum);
    }
}
