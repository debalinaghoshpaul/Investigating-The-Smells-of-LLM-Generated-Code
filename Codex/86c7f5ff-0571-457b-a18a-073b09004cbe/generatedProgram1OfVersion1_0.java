import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchStringWithLettersNumbersAndUnderscores {

    public static void main(String[] args) {
        // Define the regular expression pattern
        String pattern = "^[a-zA-Z0-9_]+$";

        // Create a Pattern object
        Pattern compiledPattern = Pattern.compile(pattern);

        // Test various input strings against the pattern
        String[] inputStrings = {
                "Hello123_", // Valid
                "hello123", // Invalid
                "123_abc", // Valid
                "abc123!", // Invalid
                "", // Invalid
                null // Invalid
        };

        for (String input : inputStrings) {
            // Create a Matcher object
            Matcher matcher = compiledPattern.matcher(input);

            // Check if the input matches the pattern
            boolean matches = matcher.matches();

            // Print the result
            System.out.println(String.format("Input: %s, Matches: %s", input, matches));
        }
    }
}
