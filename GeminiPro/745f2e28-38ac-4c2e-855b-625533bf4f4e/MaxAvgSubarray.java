import java.util.*;
import java.lang.*;

public class MaxAvgSubarray {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        double result1 = maxAvgSubarray(arr1, k1);
        System.out.println("Test case 1: " + result1); // Expected output: 12.75

        int[] arr2 = {1, -1, -1, -1, -1, -1};
        int k2 = 3;
        double result2 = maxAvgSubarray(arr2, k2);
        System.out.println("Test case 2: " + result2); // Expected output: -0.67

        int[] arr3 = {10, 20, 30, 40};
        int k3 = 2;
        double result3 = maxAvgSubarray(arr3, k3);
        System.out.println("Test case 3: " + result3); // Expected output: 25.0

        int[] arr4 = {-1, -2, -3, -4};
        int k4 = 2;
        double result4 = maxAvgSubarray(arr4, k4);
        System.out.println("Test case 4: " + result4); // Expected output: -1.5

        int[] arr5 = {1, 2, 3, 4, 5};
        int k5 = 5;
        double result5 = maxAvgSubarray(arr5, k5);
        System.out.println("Test case 5: " + result5); // Expected output: 3.0
    }

    public static double maxAvgSubarray(int[] arr, int k) {
        // Handle edge cases
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Calculate the sum of the first k elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // Initialize the maximum average and the current average
        double maxAvg = (double)sum / k;
        double currentAvg = maxAvg;

        // Iterate over the remaining elements of the array
        for (int i = k; i < arr.length; i++) {
            // Update the current average by subtracting the leftmost element and adding the rightmost element
            currentAvg = currentAvg - (double)arr[i - k] / k + (double)arr[i] / k;

            // Update the maximum average if necessary
            maxAvg = Math.max(maxAvg, currentAvg);
        }

        return maxAvg;
    }
}
