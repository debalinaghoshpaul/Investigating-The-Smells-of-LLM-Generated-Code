import java.util.*;

public class PartitionArrayIntoKSubsetsWithEqualSum {

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % k != 0) {
            return false;
        }

        int target = sum / k;

        boolean[] visited = new boolean[nums.length];
        return canPartitionKSubsetsHelper(nums, visited, target, k, 0, 0);
    }

    private static boolean canPartitionKSubsetsHelper(int[] nums, boolean[] visited, int target, int k, int currentSum, int startIndex) {
        if (k == 0) {
            return true;
        }

        if (currentSum == target) {
            return canPartitionKSubsetsHelper(nums, visited, target, k - 1, 0, 0);
        }

        for (int i = startIndex; i < nums.length; i++) {
            if (!visited[i] && currentSum + nums[i] <= target) {
                visited[i] = true;
                if (canPartitionKSubsetsHelper(nums, visited, target, k, currentSum + nums[i], i + 1)) {
                    return true;
                }
                visited[i] = false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 5, 2, 1};
        int k1 = 4;
        boolean result1 = canPartitionKSubsets(nums1, k1);
        System.out.println("Can partition nums1 into " + k1 + " subsets with equal sum: " + result1);

        int[] nums2 = {1, 2, 3, 4};
        int k2 = 3;
        boolean result2 = canPartitionKSubsets(nums2, k2);
        System.out.println("Can partition nums2 into " + k2 + " subsets with equal sum: " + result2);

        int[] nums3 = {2, 2, 2, 2, 3, 4, 5};
        int k3 = 4;
        boolean result3 = canPartitionKSubsets(nums3, k3);
        System.out.println("Can partition nums3 into " + k3 + " subsets with equal sum: " + result3);

        int[] nums4 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int k4 = 5;
        boolean result4 = canPartitionKSubsets(nums4, k4);
        System.out.println("Can partition nums4 into " + k4 + " subsets with equal sum: " + result4);

        int[] nums5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k5 = 3;
        boolean result5 = canPartitionKSubsets(nums5, k5);
        System.out.println("Can partition nums5 into " + k5 + " subsets with equal sum: " + result5);
    }
}
