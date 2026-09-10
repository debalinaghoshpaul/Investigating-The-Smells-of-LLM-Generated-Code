import java.util.Scanner;

public class SumOfNumbersInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Initialize the sum to 0
        int sum = 0;

        // Iterate over the string and extract the numbers
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to an integer
                int num = Character.getNumericValue(ch);

                // Add the number to the sum
                sum += num;
            }
        }

        // Print the sum of the numbers
        System.out.println("The sum of the numbers in the string is: " + sum);
    }
}
