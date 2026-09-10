import java.util.*;

public class BinaryArraySort {

    public static void main(String[] args) {
        int[] b_nums = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
        System.out.println("Original array: " + Arrays.toString(b_nums));
        sortBinaryArray(b_nums);
        System.out.println("Sorted array: " + Arrays.toString(b_nums));
    }

    public static void sortBinaryArray(int[] b_nums) {
        int left = 0, right = b_nums.length - 1;
        while (left < right) {
            if (b_nums[left] > b_nums[right]) {
                int temp = b_nums[left];
                b_nums[left] = b_nums[right];
                b_nums[right] = temp;
                left++;
                right--;
            } else {
                left++;
            }
        }
    }

}
