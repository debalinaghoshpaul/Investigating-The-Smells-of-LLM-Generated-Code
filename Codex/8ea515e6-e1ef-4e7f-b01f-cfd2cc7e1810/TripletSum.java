import java.util.*;

public class TripletSum {

    public static void main(String[] args) {
        int[] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
        int sum = 7;
        findTriplets(nums, sum);
    }

    public static void findTriplets(int[] nums, int sum) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int currentSum = nums[i] + nums[j] + nums[k];

                if (currentSum == sum) {
                    System.out.println("Triplet found: (" + nums[i] + ", " + nums[j] + ", " + nums[k] + ")");
                    j++;
                    k--;
                } else if (currentSum < sum) {
                    j++;
                } else {
                    k--;
                }
            }
        }
    }
}
