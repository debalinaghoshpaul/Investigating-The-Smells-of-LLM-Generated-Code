import java.util.*;

class SubarrayWithZeroSum {

    // Function to check if the given array contains a subarray with 0 sum
    public static boolean hasSubarrayWithZeroSum(int[] arr) {

        // Create a set to store the prefix sums
        Set<Integer> prefixSums = new HashSet<>();

        // Iterate over the array and calculate the prefix sums
        int prefixSum = 0;
        for (int num : arr) {
            prefixSum += num;

            // Check if the prefix sum is 0
            if (prefixSum == 0) {
                return true;
            }

            // Check if the prefix sum is already in the set
            if (prefixSums.contains(prefixSum)) {
                return true;
            }

            // Add the prefix sum to the set
            prefixSums.add(prefixSum);
        }

        // If no subarray with 0 sum is found, return false
        return false;
    }

    public static void main(String[] args) {

        // Test cases
        int[] nums1 = { 1, 2, -2, 3, 4, 5, 6 };
        int[] nums2 = { 1, 2, 3, 4, 5, 6 };
        int[] nums3 = { 1, 2, -3, 4, 5, 6 };

        // Print the output
        System.out.println("Does the said array contain a subarray with 0 sum: " + hasSubarrayWithZeroSum(nums1));
        System.out.println("Does the said array contain a subarray with 0 sum: " + hasSubarrayWithZeroSum(nums2));
        System.out.println("Does the said array contain a subarray with 0 sum: " + hasSubarrayWithZeroSum(nums3));
    }
}
