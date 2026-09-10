import java.util.*;

public class MaximumCircularSubarraySum {

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            totalSum += num;
            currentSum = Math.max(currentSum + num, num);
            maxSum = Math.max(maxSum, currentSum);
            currentSum = Math.min(currentSum + num, num);
            minSum = Math.min(minSum, currentSum);
        }

        if (totalSum == minSum) {
            return maxSum;
        } else {
            return Math.max(maxSum, totalSum - minSum);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 1, -5, 4, -3, 1, -3, 4, -1 };
        int[] nums2 = { 1, -2, 3, 0, 7, 8, 1, 2, -3 };
        System.out.println("The sum of subarray with the largest sum is " + maxSubarraySumCircular(nums1));
        System.out.println("The sum of subarray with the largest sum is " + maxSubarraySumCircular(nums2));

        // Test cases for corner cases
        int[] nums3 = { -2, -3, -1 };
        System.out.println("The sum of subarray with the largest sum is " + maxSubarraySumCircular(nums3));

        int[] nums4 = { 5, -3, 5 };
        System.out.println("The sum of subarray with the largest sum is " + maxSubarraySumCircular(nums4));

        int[] nums5 = { -3, -2, -1, -4 };
        System.out.println("The sum of subarray with the largest sum is " + maxSubarraySumCircular(nums5));
    }
}
