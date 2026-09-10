import java.util.ArrayList;
import java.util.List;

public class WordCombinations {
    public static void main(String[] args) {
        String startWord = "eat";
        List<String> combinations = generateWordCombinations(startWord);
        System.out.println(combinations);
    }

    public static List<String> generateWordCombinations(String word) {
        List<String> combinations = new ArrayList<>();
        generateCombinations("", word, combinations);
        return combinations;
    }

    private static void generateCombinations(String prefix, String remaining, List<String> combinations) {
        if (remaining.length() == 0) {
            combinations.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char currentChar = remaining.charAt(i);
            String newPrefix = prefix + currentChar;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generateCombinations(newPrefix, newRemaining, combinations);
        }
    }
}