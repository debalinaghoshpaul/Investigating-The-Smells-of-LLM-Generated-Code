import java.util.HashSet;

public class SubarrayZeroSum {

    public static boolean hasSubarrayZeroSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            sum += num;

            if (num == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, -2, 3, 4, 5, 6};
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int[] nums3 = {1, 2, -3, 4, 5, 6};

        System.out.println("Does the array nums1 contain a subarray with 0 sum: " + hasSubarrayZeroSum(nums1));
        System.out.println("Does the array nums2 contain a subarray with 0 sum: " + hasSubarrayZeroSum(nums2));
        System.out.println("Does the array nums3 contain a subarray with 0 sum: " + hasSubarrayZeroSum(nums3));
    }
}
