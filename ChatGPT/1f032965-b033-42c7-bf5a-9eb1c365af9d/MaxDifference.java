public class MaxDifference {
    public static int findMaxDifference(int[] nums) {
        int maxDiff = nums[1] - nums[0];
        int minElement = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - minElement > maxDiff) {
                maxDiff = nums[i] - minElement;
            }
            if (nums[i] < minElement) {
                minElement = nums[i];
            }
        }
        
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 };
        int maxDiff = findMaxDifference(nums);
        
        System.out.println("The maximum difference between two elements of the given array is: " + maxDiff);
    }
}
