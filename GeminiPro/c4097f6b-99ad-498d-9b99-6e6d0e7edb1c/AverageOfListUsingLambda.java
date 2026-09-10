import java.util.Arrays;
import java.util.List;

public class AverageOfListUsingLambda {

    public static void main(String[] args) {
        // Create a list of doubles
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

        // Find the average of the list using a lambda expression
        double average = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();

        // Print the average
        System.out.println("The average of the list is: " + average);
    }
}
