import java.util.Arrays;
import java.util.List;

public class AverageCalculator {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.2, 2.5, 3.8, 4.1, 5.4);
        
        double average = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        
        System.out.println("Average: " + average);
    }
}