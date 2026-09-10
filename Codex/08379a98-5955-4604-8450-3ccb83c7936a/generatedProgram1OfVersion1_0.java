import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        String targetWord = "banana";

        boolean containsWord = words.stream()
                .anyMatch(word -> word.equals(targetWord));

        if (containsWord) {
            System.out.println("The list contains the word: " + targetWord);
        } else {
            System.out.println("The list does not contain the word: " + targetWord);
        }
    }
}