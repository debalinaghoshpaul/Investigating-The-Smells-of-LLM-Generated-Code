import java.util.*;

public class EquilibriumIndices {

    public static void main(String[] args) {
        int[] nums = {-7, 1, 5, 2, -4, 3, 0};
        findEquilibriumIndices(nums);
    }

    public static void findEquilibriumIndices(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                System.out.println("Equilibrium indices found at : " + i);
            }
            leftSum += nums[i];
        }
    }
}
