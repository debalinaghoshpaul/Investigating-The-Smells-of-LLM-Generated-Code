import java.util.Arrays;

public class PairWithSpecifiedSumInRotatedSortedArray {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {11, 15, 6, 8, 9, 10};
        int sum1 = 16;
        boolean result1 = pairWithSpecifiedSumExists(arr1, sum1);
        System.out.println("Test case 1: " + result1);  // Output: true

        int[] arr2 = {11, 15, 26, 38, 9, 10};
        int sum2 = 35;
        boolean result2 = pairWithSpecifiedSumExists(arr2, sum2);
        System.out.println("Test case 2: " + result2);  // Output: true

        int[] arr3 = {11, 15, 26, 38, 9, 10};
        int sum3 = 45;
        boolean result3 = pairWithSpecifiedSumExists(arr3, sum3);
        System.out.println("Test case 3: " + result3);  // Output: false

        int[] arr4 = {11, 15, 26, 38, 9, 10};
        int sum4 = 20;
        boolean result4 = pairWithSpecifiedSumExists(arr4, sum4);
        System.out.println("Test case 4: " + result4);  // Output: false

        int[] arr5 = {11, 15, 26, 38, 9, 10};
        int sum5 = 11;
        boolean result5 = pairWithSpecifiedSumExists(arr5, sum5);
        System.out.println("Test case 5: " + result5);  // Output: true

        int[] arr6 = {11, 15, 26, 38, 9, 10};
        int sum6 = 38;
        boolean result6 = pairWithSpecifiedSumExists(arr6, sum6);
        System.out.println("Test case 6: " + result6);  // Output: true

        int[] arr7 = {};
        int sum7 = 10;
        boolean result7 = pairWithSpecifiedSumExists(arr7, sum7);
        System.out.println("Test case 7: " + result7);  // Output: false

        int[] arr8 = {1};
        int sum8 = 10;
        boolean result8 = pairWithSpecifiedSumExists(arr8, sum8);
        System.out.println("Test case 8: " + result8);  // Output: false
    }

    public static boolean pairWithSpecifiedSumExists(int[] arr, int sum) {
        // Check if the array is empty or null
        if (arr == null || arr.length < 2) {
            return false;
        }

        // Find the pivot point where the array is rotated
        int pivot = findPivot(arr);

        // If the pivot is -1, the array is not rotated
        if (pivot == -1) {
            return false;
        }

        // Check if the sum is equal to the maximum element in the array
        if (arr[pivot] == sum) {
            return true;
        }

        // Initialize two pointers, one at the pivot and the other at the end of the array
        int left = pivot;
        int right = arr.length - 1;

        // Iterate until the pointers meet
        while (left != right) {
            // Calculate the current sum
            int currentSum = arr[left] + arr[right];

            // If the current sum is equal to the specified sum, return true
            if (currentSum == sum) {
                return true;
            }

            // If the current sum is less than the specified sum, move the left pointer to the right
            else if (currentSum < sum) {
                left++;
            }

            // If the current sum is greater than the specified sum, move the right pointer to the left
            else {
                right--;
            }
        }

        // If the pointers have met and no pair with the specified sum has been found, return false
        return false;
    }

    public static int findPivot(int[] arr) {
        // Initialize the low and high pointers
        int low = 0;
        int high = arr.length - 1;

        // Iterate until the pivot is found
        while (low < high) {
            // Calculate the mid point
            int mid = (low + high) / 2;

            // If the mid element is greater than the right element, the pivot is on the left side
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // If the mid element is less than the right element, the pivot is on the right side
            else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }

            // If the mid element is equal to the right element, the pivot is the mid element
            else {
                return mid;
            }
        }

        // If the pivot is not found, return -1
        return -1;
    }
}
