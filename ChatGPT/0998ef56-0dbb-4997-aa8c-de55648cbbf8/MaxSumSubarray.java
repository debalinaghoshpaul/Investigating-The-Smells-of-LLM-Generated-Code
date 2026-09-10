import java.util.Arrays;

public class MaxSumSubarray {

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] result = findMaxSumSubarray(nums);
        
        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Largest sum of a contiguous subarray: " + result[0]);
        System.out.println("Subarray with the largest sum: " + Arrays.toString(Arrays.copyOfRange(nums, result[1], result[2]+1));
    }

    public static int[] findMaxSumSubarray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0;
        int end = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                start = i;
            } else {
                currentSum += nums[i];
            }
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
                end = i;
            }
        }
        
        return new int[] {maxSum, start, end};
    }

}
