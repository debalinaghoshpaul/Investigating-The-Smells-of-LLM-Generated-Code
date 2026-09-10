import java.util.Arrays;
import java.util.List;

public class SecondLargestAndSmallest {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 5};  // Expected: [4, 2]
        int[] arr2 = {1, 2, 3, 3, 5};  // Expected: [3, 3]
        int[] arr3 = {5, 4, 3, 2, 1};  // Expected: [4, 2]
        int[] arr4 = {5, 4, 3, 2, 2};  // Expected: [4, 3]
        int[] arr5 = {1};  // Expected: [null, null]

        // Test each test case
        for (int[] arr : Arrays.asList(arr1, arr2, arr3, arr4, arr5)) {
            System.out.println("Input: " + Arrays.toString(arr));
            System.out.println("Output: " + findSecondLargestAndSmallest(arr));
            System.out.println();
        }
    }

    public static List<Integer> findSecondLargestAndSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Arrays.asList(null, null);
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Find the second largest and smallest elements
        int secondLargest = arr[arr.length - 2];
        int secondSmallest = arr[1];

        // Return the result as a list
        return Arrays.asList(secondLargest, secondSmallest);
    }
}
