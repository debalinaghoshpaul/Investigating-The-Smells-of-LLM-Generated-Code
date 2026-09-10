public class CircularSubarraySum {
    
    public static int kadaneAlgorithm(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    
    public static int maxCircularSubarraySum(int[] nums) {
        int totalSum = 0;
        int maxStraightSum = kadaneAlgorithm(nums);
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            nums[i] = -nums[i];
        }
        int circularSum = totalSum + kadaneAlgorithm(nums);
        return Math.max(circularSum, maxStraightSum);
    }
    
    public static void main(String[] args) {
        int[] nums1 = {2, 1, -5, 4, -3, 1, -3, 4, -1};
        int[] nums2 = {1, -2, 3, 0, 7, 8, 1, 2, -3};
        
        System.out.println("The sum of subarray with the largest sum is " + maxCircularSubarraySum(nums1));
        System.out.println("The sum of subarray with the largest sum is " + maxCircularSubarraySum(nums2));
    }
}
