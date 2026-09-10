import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3);

        // Find the maximum value
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println("Maximum value: " + max);

        // Find the minimum value
        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);
        System.out.println("Minimum value: " + min);
    }
}