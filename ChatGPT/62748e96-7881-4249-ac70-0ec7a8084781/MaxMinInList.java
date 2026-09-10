import java.util.Arrays;
import java.util.List;

public class MaxMinInList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 3, 15, 7);

        // Using streams to find the maximum value
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();

        // Using streams to find the minimum value
        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
