import java.util.Scanner;
import java.util.regex.*;

public class UpperCaseFollowedByLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user input
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Create a regular expression to match the sequence
        String regex = "[A-Z][a-z]+";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(input);

        // Find all matches
        while (matcher.find()) {
            // Print the match
            System.out.println(matcher.group());
        }
    }
}
