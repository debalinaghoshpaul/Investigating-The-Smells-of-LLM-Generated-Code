import java.util.Arrays;
import java.util.List;

public class MaxAndMinInList {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Find the maximum and minimum values using lambda expressions
        int maxValue = numbers.stream().max((a, b) -> a - b).get();
        int minValue = numbers.stream().min((a, b) -> a - b).get();

        // Print the results
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
    }
}
