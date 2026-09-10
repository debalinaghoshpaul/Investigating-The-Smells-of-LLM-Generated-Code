import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        List<Integer> oddNumbers = filter(numbers, n -> n % 2 != 0);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    public static List<Integer> filter(List<Integer> numbers, NumberFilter filter) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (filter.test(number)) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }

    interface NumberFilter {
        boolean test(int number);
    }
}