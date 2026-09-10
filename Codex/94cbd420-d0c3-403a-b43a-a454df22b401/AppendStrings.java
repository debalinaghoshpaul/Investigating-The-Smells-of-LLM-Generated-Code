import java.util.Scanner;

public class AppendStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two strings from the user.
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Check if the strings are different lengths.
        if (firstString.length() != secondString.length()) {
            // Remove characters from the beginning of the longer string to make them equal lengths.
            if (firstString.length() > secondString.length()) {
                firstString = firstString.substring(0, secondString.length());
            } else {
                secondString = secondString.substring(0, firstString.length());
            }
        }

        // Append the two strings together.
        String result = firstString + secondString;

        // Print the result.
        System.out.println("The result is: " + result);
    }
}
