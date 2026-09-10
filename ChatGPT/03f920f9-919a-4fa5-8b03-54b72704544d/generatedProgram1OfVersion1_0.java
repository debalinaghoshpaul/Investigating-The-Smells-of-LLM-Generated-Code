import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer number less than ten billion: ");
        int number = scanner.nextInt();
        int count = 0;

        // Handle corner cases
        if (number == 0) {
            count = 1;
        } else if (number < 0 || number >= 10000000000L) {
            System.out.println("Invalid input. Please enter a positive integer less than ten billion.");
            return;
        }

        // Count the number of digits
        while (number > 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits in the number: " + count);
    }
}
