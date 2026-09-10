import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "grape", "kiwi", "orange");

        // Sort in ascending order
        List<String> sortedAscending = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted in ascending order: " + sortedAscending);

        // Sort in descending order
        List<String> sortedDescending = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());

        System.out.println("Sorted in descending order: " + sortedDescending);
    }
}
    
Output:
Sorted in ascending order: [apple, banana, grape, kiwi, orange]
Sorted in descending order: [orange, kiwi, grape, banana, apple]
