import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);

        // Print the original list
        System.out.println("Original list: " + numbers);

        // Remove duplicates from the list using a lambda expression
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        // Print the distinct list
        System.out.println("Distinct list: " + distinctNumbers);
    }
}
