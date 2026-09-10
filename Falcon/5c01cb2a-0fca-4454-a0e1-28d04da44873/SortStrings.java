import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStrings {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "dog", "elephant");

        // Sort the list of strings in alphabetical order using a lambda expression
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));

        // Print the sorted list of strings
        System.out.println(strings);
    }
}
