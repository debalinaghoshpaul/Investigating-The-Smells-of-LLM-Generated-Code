import java.util.Arrays;

public class LargestNumberFinder {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 4, 6};
        System.out.println("Largest number using the said array numbers: " + findLargestNumber(nums));
    }

    public static int findLargestNumber(int[] nums) {
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();

        for (int i = nums.length - 1; i >= 0; i--) {
            sb.append(nums[i]);
        }

        return Integer.parseInt(sb.toString());
    }
}
