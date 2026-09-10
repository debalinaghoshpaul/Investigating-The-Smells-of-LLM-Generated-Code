import java.util.Scanner;

public class CountNumbersWithout7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input from the user
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        // Initialize the count to 0
        int count = 0;

        // Iterate from 1 to the given number
        for (int i = 1; i <= number; i++) {
            // Check if the number does not contain 7
            if (!contains7(i)) {
                // Increment the count
                count++;
            }
        }

        // Print the count
        System.out.println("The number of numbers without 7 from 1 to " + number + " is: " + count);
    }

    private static boolean contains7(int number) {
        // Convert the number to a string
        String numberString = Integer.toString(number);

        // Check if the string contains 7
        return numberString.contains("7");
    }
}
