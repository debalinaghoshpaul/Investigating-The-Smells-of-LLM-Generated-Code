import java.util.Arrays;
import java.util.Comparator;

public class DescendingSort {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 3};

        // Sort the array in descending order using Comparator.reverseOrder()
        Arrays.sort(arr, Comparator.reverseOrder());

        System.out.println(Arrays.toString(arr));  // Output: [9, 5, 3, 2, 1]
    }
}
