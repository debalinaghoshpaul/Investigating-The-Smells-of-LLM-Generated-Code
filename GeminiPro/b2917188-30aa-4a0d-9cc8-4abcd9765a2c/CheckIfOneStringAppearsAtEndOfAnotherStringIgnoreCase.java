import java.util.Scanner;

public class CheckIfOneStringAppearsAtEndOfAnotherStringIgnoreCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Convert the strings to lowercase for case-insensitive comparison.
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        // Check if the first string appears at the end of the second string.
        boolean firstAppearsAtEnd = secondString.endsWith(firstString);

        // Check if the second string appears at the end of the first string.
        boolean secondAppearsAtEnd = firstString.endsWith(secondString);

        // Print the results.
        if (firstAppearsAtEnd) {
            System.out.println("The first string appears at the end of the second string.");
        } else if (secondAppearsAtEnd) {
            System.out.println("The second string appears at the end of the first string.");
        } else {
            System.out.println("Neither string appears at the end of the other string.");
        }
    }
}
