import java.util.Scanner;

public class TestStringContainsSequence {

    public static void main(String[] args) {
        // Get the input string from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the sequence of characters to search for from the user.
        System.out.println("Enter a sequence of characters to search for: ");
        String searchString = scanner.nextLine();

        // Check if the input string contains the search string.
        boolean containsSequence = inputString.contains(searchString);

        // Print the result.
        if (containsSequence) {
            System.out.println("The input string contains the specified sequence of characters.");
        } else {
            System.out.println("The input string does not contain the specified sequence of characters.");
        }
    }
}
