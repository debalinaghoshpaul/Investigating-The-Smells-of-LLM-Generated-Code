public class LargestSumSubarray {
    // Function to find the maximum subarray sum within a circular array
    public static int maxSubarraySumCircular(int[] nums) {
        int maxStraightSum = kadane(nums);
        
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            nums[i] = -nums[i];
        }
        
        int maxCircularSum = totalSum + kadane(nums);
        
        return Math.max(maxStraightSum, maxCircularSum);
    }
    
    // Function to find the maximum subarray sum using Kadane's algorithm
    private static int kadane(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 1, -5, 4, -3, 1, -3, 4, -1 };
        int[] nums2 = { 1, -2, 3, 0, 7, 8, 1, 2, -3 };
        
        System.out.println("The sum of subarray with the largest sum is " + maxSubarraySumCircular(nums1));
        System.out.println("The sum of subarray with the largest sum is " + maxSubarraySumCircular(nums2));
    }
}
