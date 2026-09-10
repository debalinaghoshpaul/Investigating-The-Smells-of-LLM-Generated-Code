import java.util.*;

public class FindUnsortedSubarray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 4, 6};
        int[] nums2 = {1, 3, 2, 7, 5, 6, 4, 8};

        System.out.println("Continuous subarray for nums1: " + findUnsortedSubarray(nums1));
        System.out.println("Continuous subarray for nums2: " + findUnsortedSubarray(nums2));
    }

    public static String findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return "";
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find the minimum and maximum elements in the unsorted subarray.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i - 1]);
            }
        }

        // If the unsorted subarray is not empty, find its boundaries.
        int left = 0;
        int right = nums.length - 1;
        while (left < nums.length && nums[left] <= min) {
            left++;
        }
        while (right >= 0 && nums[right] >= max) {
            right--;
        }

        // Return the boundaries of the unsorted subarray.
        if (left < right) {
            return Arrays.toString(Arrays.copyOfRange(nums, left, right + 1));
        } else {
            return "";
        }
    }
}
