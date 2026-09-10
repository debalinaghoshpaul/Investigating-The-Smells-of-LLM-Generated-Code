import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfSquares {

    public static void main(String[] args) {
        // Sample list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of squares of all odd numbers
        int sumOfOddSquares = IntStream.of(numbers)
                .filter(num -> num % 2 != 0)
                .map(num -> num * num)
                .sum();

        // Sum of squares of all even numbers
        int sumOfEvenSquares = IntStream.of(numbers)
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .sum();

        System.out.println("Sum of squares of odd numbers: " + sumOfOddSquares);
        System.out.println("Sum of squares of even numbers: " + sumOfEvenSquares);
    }
}
