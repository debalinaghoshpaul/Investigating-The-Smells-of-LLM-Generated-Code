import java.util.Arrays;
import java.util.List;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";

        List<String> words = Arrays.asList(sentence.split(" "));

        long count = words.stream()
                .filter(word -> !word.isEmpty())
                .count();

        System.out.println("Number of words: " + count);
    }
}