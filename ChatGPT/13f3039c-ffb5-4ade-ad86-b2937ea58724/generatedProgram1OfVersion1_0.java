import java.util.Arrays;
import java.util.List;

public class LambdaExpressionMultiplySumList {

    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Define a lambda expression to multiply all elements in the list
        MultiplyFunction multiply = (a, b) -> a * b;

        // Multiply all elements in the list using the lambda expression
        int product = numbers.stream()
                .reduce(multiply)
                .orElse(1);

        // Define a lambda expression to sum all elements in the list
        SumFunction sum = (a, b) -> a + b;

        // Sum all elements in the list using the lambda expression
        int sumResult = numbers.stream()
                .reduce(sum)
                .orElse(0);

        // Print the product and sum of all elements in the list
        System.out.println("Product of all elements in the list: " + product);
        System.out.println("Sum of all elements in the list: " + sumResult);
    }

    @FunctionalInterface
    public interface MultiplyFunction {
        int multiply(int a, int b);
    }

    @FunctionalInterface
    public interface SumFunction {
        int sum(int a, int b);
    }

    // Test cases
    // Corner cases:
    // Empty list
    List<Integer> emptyList = Arrays.asList();

    // List with a single element
    List<Integer> singleElementList = Arrays.asList(1);

    // List with negative elements
    List<Integer> negativeElementList = Arrays.asList(-1, -2, -3);
}
