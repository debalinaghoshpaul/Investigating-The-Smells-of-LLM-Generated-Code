import java.util.regex.*;

public class FindLowercaseLetterSequences {

    public static void main(String[] args) {
        String text = "This_is_a_test_of_the_regex_pattern.";

        // Create a regular expression pattern to match sequences of lowercase letters joined by an underscore
        String pattern = "[a-z]+_[a-z]+";

        // Create a Pattern object
        Pattern p = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher m = p.matcher(text);

        // Find all matches of the pattern in the text
        while (m.find()) {
            // Print the matching sequence
            System.out.println(m.group());
        }
    }
}
