import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2, 5, 4};

        // Step 1: Sort in ascending order
        Arrays.sort(arr);

        // Step 2: Reverse the array to get descending order
        Collections.reverse(Arrays.asList(arr));

        System.out.println(Arrays.toString(arr));  // Output: [5, 4, 3, 2, 1]
    }
}
