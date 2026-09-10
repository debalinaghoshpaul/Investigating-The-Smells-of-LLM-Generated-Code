import java.util.Arrays;
import java.util.Comparator;

public class DescendingSort {
    public static void main(String[] args) {
        Integer[] array = {5, 2, 8, 3, 9, 1};

        // Sort in descending order using a custom comparator
        Arrays.sort(array, Comparator.reverseOrder());

        System.out.println("Sorted array in descending order: " + Arrays.toString(array));
    }
}
