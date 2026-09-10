import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestAndSmallestStringInList {

    public static void main(String[] args) {
        // Create a sample list of strings
        List<String> sampleList = new ArrayList<>();
        sampleList.add("Hello");
        sampleList.add("World");
        sampleList.add("This");
        sampleList.add("is");
        sampleList.add("a");
        sampleList.add("sample");
        sampleList.add("list");

        // Find the longest string in the list using a lambda expression
        String longestString = sampleList.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);

        // Find the smallest string in the list using a lambda expression
        String smallestString = sampleList.stream()
                .min(Comparator.comparing(String::length))
                .orElse(null);

        // Print the results
        System.out.println("Longest String: " + longestString);
        System.out.println("Smallest String: " + smallestString);
    }
}
