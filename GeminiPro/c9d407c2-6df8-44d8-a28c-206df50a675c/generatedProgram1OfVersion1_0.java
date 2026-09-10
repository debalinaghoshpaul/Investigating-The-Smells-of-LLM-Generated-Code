import java.util.regex.*;

public class MatchStringWithPQ {

    public static void main(String[] args) {
        String regex = "p.*q";
        String input = "pq";
        boolean matches = Pattern.matches(regex, input);
        System.out.println("Input string: " + input);
        System.out.println("Matches the pattern: " + matches);

        // Test cases
        System.out.println("\nTest cases:");
        String[] testCases = {"paqr", "ppq", "p", "pqrr", "p1q", "p?q"};
        for (String testCase : testCases) {
            boolean match = Pattern.matches(regex, testCase);
            System.out.println(testCase + " matches: " + match);
        }
    }
}
