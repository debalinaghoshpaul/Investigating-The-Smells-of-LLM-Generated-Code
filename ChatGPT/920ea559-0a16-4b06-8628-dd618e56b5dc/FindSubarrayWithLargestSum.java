import java.util.*;

class FindSubarrayWithLargestSum {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + findMaxSubarraySum(arr));

        int[] arr2 = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        System.out.println("Maximum subarray sum: " + findMaxSubarraySum(arr2));

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Maximum subarray sum: " + findMaxSubarraySum(arr3));

        int[] arr4 = {-1, -2, -3, -4, -5, -6, -7, -8, -9};
        System.out.println("Maximum subarray sum: " + findMaxSubarraySum(arr4));

        int[] arr5 = {};
        System.out.println("Maximum subarray sum: " + findMaxSubarraySum(arr5));

        int[] arr6 = null;
        System.out.println("Maximum subarray sum: " + findMaxSubarraySum(arr6));
    }

    public static int findMaxSubarraySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
