import java.util.List;

public class SecondMinMax {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 9, 1);

        int secondSmallest = numbers.stream()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("List is too small"));

        int secondLargest = numbers.stream()
                .sorted()
                .distinct()
                .skip(numbers.size() - 2)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("List is too small"));

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}