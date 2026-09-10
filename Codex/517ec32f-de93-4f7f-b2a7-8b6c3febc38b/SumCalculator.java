import java.util.List;

public class SumCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenSum = calculateSum(numbers, true);
        int oddSum = calculateSum(numbers, false);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static <T extends Number> int calculateSum(List<T> numbers, boolean even) {
        int sum = 0;
        for (T number : numbers) {
            if (even && number.intValue() % 2 == 0) {
                sum += number.intValue();
            } else if (!even && number.intValue() % 2 != 0) {
                sum += number.intValue();
            }
        }
        return sum;
    }
}
