import java.util.Arrays;

public class DivideArrayIntoSubsets {

    public static boolean canDivideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        if (sum % k != 0 || k > nums.length) {
            return false;
        }
        
        int targetSum = sum / k;
        int[] subsetSums = new int[k];
        
        return partition(nums, subsetSums, targetSum, nums.length - 1);
    }

    public static boolean partition(int[] nums, int[] subsetSums, int targetSum, int index) {
        if (index < 0) {
            for (int sum : subsetSums) {
                if (sum != targetSum) {
                    return false;
                }
            }
            return true;
        }
        
        int num = nums[index];
        for (int i = 0; i < subsetSums.length; i++) {
            if (subsetSums[i] + num <= targetSum) {
                subsetSums[i] += num;
                if (partition(nums, subsetSums, targetSum, index - 1)) {
                    return true;
                }
                subsetSums[i] -= num;
            }
            if (subsetSums[i] == 0) {
                break;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 5, 6, 6};
        int k = 4;
        
        if (canDivideArray(nums, k)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
