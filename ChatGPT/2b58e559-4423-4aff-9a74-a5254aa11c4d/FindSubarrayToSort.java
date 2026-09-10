import java.util.Arrays;

public class FindSubarrayToSort {

    public static void findSubarray(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        int start = 0;
        int end = nums.length - 1;

        while (start < nums.length && nums[start] == sortedNums[start]) {
            start++;
        }

        if (start == nums.length) {
            System.out.println("No subarray found");
            return;
        }

        while (end >= 0 && nums[end] == sortedNums[end]) {
            end--;
        }

        System.out.print("Continuous subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 4, 6};
        int[] nums2 = {1, 3, 2, 7, 5, 6, 4, 8};

        findSubarray(nums1);
        findSubarray(nums2);
    }
}
