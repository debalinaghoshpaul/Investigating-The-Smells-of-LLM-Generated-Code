import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestWords {

    public static List<String> findLongestWords(List<String> words) {
        // Find the maximum length of any word in the list
        int maxLength = words.stream()
            .mapToInt(String::length)
            .max()
            .orElse(0);

        // Filter the list to include only words with the maximum length
        return words.stream()
            .filter(word -> word.length() == maxLength)
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "flag", "green", "country", "w3resource");

        System.out.println(findLongestWords(words)); // Output: [w3resource]

        List<String> words2 = Arrays.asList("cat", "dog", "red", "is", "am");

        System.out.println(findLongestWords(words2)); // Output: [cat, dog, red]
    }
}
