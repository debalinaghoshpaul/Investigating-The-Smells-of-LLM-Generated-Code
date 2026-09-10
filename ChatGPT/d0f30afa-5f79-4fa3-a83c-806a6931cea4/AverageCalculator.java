import java.util.List;

public class AverageCalculator {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 9, 11);

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average: " + average);
    }
}
