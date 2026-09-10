import java.util.Arrays;

public class MinimumSubarraySum {

    public static void findMinimumSubarraySum(int[] nums, int subarraySize) {
        if (nums == null || nums.length == 0 || subarraySize <= 0 || subarraySize > nums.length) {
            System.out.println("Invalid input");
            return;
        }

        int minSum = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i <= nums.length - subarraySize; i++) {
            int sum = 0;
            for (int j = i; j < i + subarraySize; j++) {
                sum += nums[j];
            }
            if (sum < minSum) {
                minSum = sum;
                minIndex = i;
            }
        }

        System.out.println("Sub-array size: " + subarraySize);
        System.out.println("Sub-array from " + minIndex + " to " + (minIndex + subarraySize - 1) + " and sum is: " + minSum);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int subarraySize = 4;

        findMinimumSubarraySum(nums, subarraySize);
    }
}
