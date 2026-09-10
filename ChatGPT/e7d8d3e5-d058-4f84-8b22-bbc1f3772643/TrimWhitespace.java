import java.util.Scanner;

public class TrimWhitespace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Trim the leading and trailing whitespace from the input string.
        String trimmed = input.trim();

        // Print the trimmed string.
        System.out.println("The trimmed string is: " + trimmed);
    }
}
