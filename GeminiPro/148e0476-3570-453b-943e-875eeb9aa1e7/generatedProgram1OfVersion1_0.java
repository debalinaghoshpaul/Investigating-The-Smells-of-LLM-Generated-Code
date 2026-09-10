import java.util.*;

public class LongestBitonicSubarray {

    public static int longestBitonicSubarray(int[] arr) {
        int n = arr.length;
        int[] increasing = new int[n];
        int[] decreasing = new int[n];

        // Initialize the increasing and decreasing arrays
        increasing[0] = 1;
        decreasing[n - 1] = 1;

        // Calculate the length of the increasing subarray
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                increasing[i] = increasing[i - 1] + 1;
            } else {
                increasing[i] = 1;
            }
        }

        // Calculate the length of the decreasing subarray
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                decreasing[i] = decreasing[i + 1] + 1;
            } else {
                decreasing[i] = 1;
            }
        }

        // Find the maximum length of the bitonic subarray
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            if (increasing[i] + decreasing[i] - 1 > maxLen) {
                maxLen = increasing[i] + decreasing[i] - 1;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int result = longestBitonicSubarray(arr);
        System.out.println("The length of the longest bitonic subarray is: " + result);

        int[] arr2 = {1, 11, 2, 10, 4, 5, 2, 1};
        int result2 = longestBitonicSubarray(arr2);
        System.out.println("The length of the longest bitonic subarray is: " + result2);

        int[] arr3 = {1, 2, 3, 4, 5};
        int result3 = longestBitonicSubarray(arr3);
        System.out.println("The length of the longest bitonic subarray is: " + result3);

        int[] arr4 = {5, 4, 3, 2, 1};
        int result4 = longestBitonicSubarray(arr4);
        System.out.println("The length of the longest bitonic subarray is: " + result4);
    }
}
