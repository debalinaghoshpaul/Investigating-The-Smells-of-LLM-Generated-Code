import java.util.regex.*;

public class MatchAnyCharacterOrSequence {

    public static void main(String[] args) {
        // Test cases
        String[] inputs = {"a", "ab", "abc", "a?", "a*", "a.bc", "a?bc", "a*bc", "a?.bc", "a*.bc"};
        String[] patterns = {"a", "a.", "a?", "a*", "a?.", "a*."};

        // Iterate over test cases
        for (String input : inputs) {
            for (String pattern : patterns) {
                System.out.println("Input: " + input + ", Pattern: " + pattern);

                // Compile the regex pattern
                Pattern regex = Pattern.compile(pattern);

                // Create a matcher object
                Matcher matcher = regex.matcher(input);

                // Check if the input matches the pattern
                boolean matches = matcher.matches();

                // Print the result
                System.out.println("Matches: " + matches);
                System.out.println();
            }
        }
    }
}
