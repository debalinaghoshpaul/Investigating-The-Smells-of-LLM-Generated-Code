import java.util.Arrays;

public class MaximumSumSubarray {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {2, -8, 3, -2, 4, -10};
        int[] arr2 = {1, -2, 3, -4, 5, -6, 7, -8};
        int[] arr3 = {-1, -2, -3, -4, -5};
        int[] arr4 = {1};
        int[] arr5 = {};

        // Expected results
        int[] expected1 = {4, -10};
        int[] expected2 = {7, -8};
        int[] expected3 = {-1};
        int[] expected4 = {1};
        int[] expected5 = {};

        // Compute the maximum sum subarray for each test case
        int[] result1 = maximumSumSubarray(arr1);
        int[] result2 = maximumSumSubarray(arr2);
        int[] result3 = maximumSumSubarray(arr3);
        int[] result4 = maximumSumSubarray(arr4);
        int[] result5 = maximumSumSubarray(arr5);

        // Check if the results match the expected results
        boolean test1 = Arrays.equals(result1, expected1);
        boolean test2 = Arrays.equals(result2, expected2);
        boolean test3 = Arrays.equals(result3, expected3);
        boolean test4 = Arrays.equals(result4, expected4);
        boolean test5 = Arrays.equals(result5, expected5);

        // Print the results
        System.out.println("Test 1: " + test1);
        System.out.println("Test 2: " + test2);
        System.out.println("Test 3: " + test3);
        System.out.println("Test 4: " + test4);
        System.out.println("Test 5: " + test5);
    }

    public static int[] maximumSumSubarray(int[] arr) {
        // Initialize the current and maximum sums to the first element of the array
        int currentSum = arr[0];
        int maxSum = arr[0];
        int start = 0;
        int end = 0;

        // Iterate over the remaining elements of the array
        for (int i = 1; i < arr.length; i++) {
            // Update the current sum by adding the current element
            currentSum += arr[i];

            // If the current sum is less than zero, reset it to zero and update the start index
            if (currentSum < 0) {
                currentSum = 0;
                start = i + 1;
            }

            // If the current sum is greater than the maximum sum, update the maximum sum and the end index
            if (currentSum > maxSum) {
                maxSum = currentSum;
                end = i;
            }
        }

        // Return the maximum sum and the corresponding subarray
        return new int[]{maxSum, start, end};
    }
}
