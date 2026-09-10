import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Check if the strings have the same length.
        if (str1.length() == str2.length()) {
            System.out.println("The strings have the same length. Please enter two strings with different lengths.");
        } else {
            // Create a new string in the form of short_string + long_string + short_string.
            String result = "";
            if (str1.length() < str2.length()) {
                result = str1 + str2 + str1;
            } else {
                result = str2 + str1 + str2;
            }

            // Print the result.
            System.out.println("The new string is: " + result);
        }
    }
}
