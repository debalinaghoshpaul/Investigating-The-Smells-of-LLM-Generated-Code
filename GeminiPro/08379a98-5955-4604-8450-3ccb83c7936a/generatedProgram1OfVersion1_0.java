import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindWordInList {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "strawberry");

        // Define a lambda expression to check if a string contains a specific word
        Predicate<String> containsWord = word -> word.contains("apple");

        // Use the lambda expression to check if the list contains the word "apple"
        boolean containsApple = words.stream().anyMatch(containsWord);

        // Print the result
        System.out.println(containsApple); // Output: true
    }
}
