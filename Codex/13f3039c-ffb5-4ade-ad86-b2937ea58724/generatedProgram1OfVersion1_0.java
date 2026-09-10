import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int result = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Multiplication result: " + result);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum result: " + sum);
    }
}