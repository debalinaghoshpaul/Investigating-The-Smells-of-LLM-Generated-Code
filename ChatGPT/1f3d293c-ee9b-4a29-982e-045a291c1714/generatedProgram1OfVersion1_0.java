import java.util.regex.Pattern;

public class StringContainsOnlyCertainCharacters {

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"abcd1234", "AbCd1234", "ABCDefg1234", "1234567890", "abc def", "123 456"};

        // Pattern to match strings containing only a-z, A-Z, and 0-9
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");

        // Iterate over test cases and check if each string matches the pattern
        for (String testString : testStrings) {
            boolean matchesPattern = pattern.matcher(testString).matches();

            // Print the result for each test case
            System.out.println("Input string: " + testString);
            System.out.println("Matches pattern: " + matchesPattern);
            System.out.println();
        }
    }
}
