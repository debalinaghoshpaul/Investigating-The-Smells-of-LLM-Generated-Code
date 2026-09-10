import java.util.regex.*;

public class RemoveSpecifiedCharactersFromString {

    public static void main(String[] args) {
        String str = "Remove b and ac from this string.";

        // Create a regular expression to match the characters to be removed
        String regex = "[bac]";

        // Compile the regular expression into a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object to match the regular expression against the string
        Matcher matcher = pattern.matcher(str);

        // Use the Matcher object to replace all occurrences of the specified characters with an empty string
        String result = matcher.replaceAll("");

        // Print the resulting string
        System.out.println(result);
    }
}
