import java.util.Arrays;

public class LargestElementBetweenFirstLastMiddle {

    public static void main(String[] args) {
        // Original array
        int[] arr = {20, 30, 40, 50, 67};

        // Find the largest element between the first, last, and middle values
        int largest = findLargest(arr);

        // Print the result
        System.out.println("Largest element between first, last, and middle values: " + largest);
    }

    public static int findLargest(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        // Find the middle index
        int middle = arr.length / 2;

        // Find the maximum of the first, last, and middle elements
        int max = Math.max(arr[0], Math.max(arr[middle], arr[arr.length - 1]));

        // Return the maximum value
        return max;
    }

    // Test cases
    public static void testCases() {
        // Test case 1: Even length array
        int[] arr1 = {20, 30, 40, 50, 67};
        int expected1 = 67;
        int actual1 = findLargest(arr1);
        System.out.println("Test case 1: " + (actual1 == expected1));

        // Test case 2: Odd length array
        int[] arr2 = {20, 30, 40, 50};
        try {
            findLargest(arr2);
            System.out.println("Test case 2: Failed (should have thrown an exception)");
        } catch (IllegalArgumentException e) {
            System.out.println("Test case 2: Passed");
        }

        // Test case 3: Empty array
        int[] arr3 = {};
        try {
            findLargest(arr3);
            System.out.println("Test case 3: Failed (should have thrown an exception)");
        } catch (IllegalArgumentException e) {
            System.out.println("Test case 3: Passed");
        }
    }
}
