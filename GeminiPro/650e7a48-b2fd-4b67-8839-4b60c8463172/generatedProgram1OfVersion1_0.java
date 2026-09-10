import java.util.regex.Pattern;

public class MatchWordContainingG {

    public static void main(String[] args) {
        String[] words = {"dog", "cat", "tiger", "lion", "elephant", "zebra", "giraffe"};

        // Pattern to match words containing 'g' not at the start or end of the word
        Pattern pattern = Pattern.compile(".*g.*");

        for (String word : words) {
            if (pattern.matcher(word).matches()) {
                System.out.println(word);
            }
        }
    }
}
