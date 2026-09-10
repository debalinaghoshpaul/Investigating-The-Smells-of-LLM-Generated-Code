import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the sum and count of numbers
        double sum = 0;
        int count = 0;

        // Read numbers from the user until the user enters a negative number
        double number;
        while ((number = scanner.nextDouble()) >= 0) {
            // Add the number to the sum
            sum += number;

            // Increment the count of numbers
            count++;
        }

        // Calculate the average
        double average = sum / count;

        // Print the average
        System.out.println("The average is: " + average);
    }
}
