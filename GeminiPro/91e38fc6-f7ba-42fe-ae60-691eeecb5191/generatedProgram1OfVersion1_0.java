import java.util.Arrays;

public class RotationCount {

    public static int findRotationCount(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[(mid + 1) % n] < nums[mid]) {
                return mid + 1;
            } else if (nums[(mid - 1 + n) % n] > nums[mid]) {
                return mid;
            } else if (nums[mid] < nums[0]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(findRotationCount(nums1) == 0);

        int[] nums2 = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(findRotationCount(nums2) == 3);

        int[] nums3 = {7, 1, 2, 3, 4, 5, 6};
        System.out.println(findRotationCount(nums3) == 1);

        int[] nums4 = {1};
        System.out.println(findRotationCount(nums4) == 0);

        int[] nums5 = {};
        System.out.println(findRotationCount(nums5) == -1);
    }
}
