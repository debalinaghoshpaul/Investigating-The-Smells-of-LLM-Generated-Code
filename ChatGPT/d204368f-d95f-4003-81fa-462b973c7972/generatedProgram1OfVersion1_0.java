import java.util.Arrays;

public class RearrangeArray {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };

        rearrangeArray(nums);

        System.out.println("Array with every second element is greater than its left and right elements: " + Arrays.toString(nums));
    }

    public static void rearrangeArray(int[] nums) {
        Arrays.sort(nums);

        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i += 2) {
            result[i] = nums[index++];
        }

        for (int i = 1; i < nums.length; i += 2) {
            result[i] = nums[index++];
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}
