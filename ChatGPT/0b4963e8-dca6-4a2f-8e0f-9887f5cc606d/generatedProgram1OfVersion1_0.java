import java.util.Arrays;
import java.util.List;

public class StringConverter {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("Hello", "World", "!");

        // Convert the list of strings to uppercase using a lambda expression
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .toList();

        // Convert the list of strings to lowercase using a lambda expression
        List<String> lowerCaseStrings = strings.stream()
                .map(String::toLowerCase)
                .toList();

        // Print the original list, the uppercase list, and the lowercase list
        System.out.println("Original list: " + strings);
        System.out.println("Uppercase list: " + upperCaseStrings);
        System.out.println("Lowercase list: " + lowerCaseStrings);
    }
}
