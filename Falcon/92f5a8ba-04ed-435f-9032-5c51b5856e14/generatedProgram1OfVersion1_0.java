public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 4, 6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Largest number using the said array numbers: " + max);
    }
}

// 