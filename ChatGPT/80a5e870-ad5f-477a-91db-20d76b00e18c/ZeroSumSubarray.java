import java.util.HashSet;

public class ZeroSumSubarray {

    public static boolean hasZeroSumSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            set.add(sum);
            sum += num;
            if (set.contains(sum) || sum == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, -2, 3, 4, 5, 6};
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int[] nums3 = {1, 2, -3, 4, 5, 6};

        System.out.println("Does the said array contain a subarray with 0 sum: " + hasZeroSumSubarray(nums1));
        System.out.println("Does the said array contain a subarray with 0 sum: " + hasZeroSumSubarray(nums2));
        System.out.println("Does the said array contain a subarray with 0 sum: " + hasZeroSumSubarray(nums3));
    }
}
