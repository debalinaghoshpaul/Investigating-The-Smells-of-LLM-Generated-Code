import java.util.*;
import java.lang.*;

class SubarrayWithZeroSum {
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        printSubarraysWithZeroSum(nums1);
        System.out.println();

        // Test case 2
        int[] nums2 = {1, 2, -3, 4, 5, 6};
        printSubarraysWithZeroSum(nums2);
        System.out.println();

        // Test case 3
        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};
        printSubarraysWithZeroSum(nums3);
        System.out.println();

        // Test case 4
        int[] nums4 = {1, 2, -2};
        printSubarraysWithZeroSum(nums4);
        System.out.println();

        // Test case 5
        int[] nums5 = {};
        printSubarraysWithZeroSum(nums5);
        System.out.println();
    }

    public static void printSubarraysWithZeroSum(int[] nums) {
        // Create a map to store the sum of subarrays and their starting indices
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        sumMap.put(0, new ArrayList<>());

        // Calculate the cumulative sum of the array
        int[] cumulativeSum = new int[nums.length];
        cumulativeSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + nums[i];
        }

        // Iterate over the cumulative sum array and check if any sum has been encountered before
        for (int i = 0; i < nums.length; i++) {
            int sum = cumulativeSum[i];
            if (sumMap.containsKey(sum)) {
                List<Integer> startingIndices = sumMap.get(sum);
                for (int startIndex : startingIndices) {
                    System.out.printf("Sub-array with 0 sum: [");
                    for (int j = startIndex; j <= i; j++) {
                        System.out.printf("%d, ", nums[j]);
                    }
                    System.out.println("]");
                }
            }
            sumMap.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }
}
