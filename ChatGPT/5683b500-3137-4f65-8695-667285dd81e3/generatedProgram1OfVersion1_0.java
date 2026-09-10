import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InsertDash {

    public static void main(String[] args) {
        String input = "HelloBeautifulWorld";
        String output = insertDash(input);
        System.out.println(output); // Output: Hello-Beautiful-World
    }

    public static String insertDash(String input) {
        // Create a regular expression pattern to match upper case letters followed by lower case letters
        Pattern pattern = Pattern.compile("([A-Z])(?=[a-z])");

        // Create a matcher object to apply the pattern to the input string
        Matcher matcher = pattern.matcher(input);

        // Use the matcher to find all matches of the pattern in the input string
        while (matcher.find()) {
            // Get the start and end indices of the match
            int start = matcher.start();
            int end = matcher.end();

            // Insert a dash (-) between the upper case letter and the lower case letter
            input = input.substring(0, start + 1) + "-" + input.substring(start + 1, end);
        }

        return input;
    }
}
