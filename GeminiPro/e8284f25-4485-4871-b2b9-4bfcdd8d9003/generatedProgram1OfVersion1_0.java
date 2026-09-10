import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageStringLength {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("This", "is", "a", "list", "of", "strings");

        // Find the average length of the strings in the list using a lambda expression
        double averageLength = strings.stream()
                .mapToInt(String::length)
                .average()
                .getAsDouble();

        // Print the average length
        System.out.println("The average length of the strings in the list is: " + averageLength);
    }
}
