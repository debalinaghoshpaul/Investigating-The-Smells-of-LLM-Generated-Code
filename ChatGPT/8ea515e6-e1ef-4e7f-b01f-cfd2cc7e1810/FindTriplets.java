import java.util.Arrays;

public class FindTriplets {

    public static void findTriplets(int[] nums, int targetSum) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum == targetSum) {
                    System.out.printf("(%d %d %d) ", nums[i], nums[left], nums[right]);
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 0, 8, 4, 1, 7};
        int targetSum = 7;

        System.out.printf("Triplets of sum %d: ", targetSum);
        findTriplets(nums, targetSum);
    }
}
