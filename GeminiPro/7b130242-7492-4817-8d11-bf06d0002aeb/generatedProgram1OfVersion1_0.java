import java.util.regex.*;

public class MatchPQZeroOrMoreQ {

    public static void main(String[] args) {
        // Create a string to match
        String str = "pq";

        // Create a regex pattern to match a string that has a p followed by zero or more q's
        Pattern pattern = Pattern.compile("p+q*");

        // Create a matcher object to match the string against the regex pattern
        Matcher matcher = pattern.matcher(str);

        // Check if the string matches the regex pattern
        if (matcher.matches()) {
            System.out.println("The string matches the regex pattern");
        } else {
            System.out.println("The string does not match the regex pattern");
        }
    }
}
