import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Find the length of the longest string
        int maxLength = strings.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
        System.out.println("Length of the longest string: " + maxLength);

        // Find the length of the smallest string
        int minLength = strings.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);
        System.out.println("Length of the smallest string: " + minLength);
    }
}