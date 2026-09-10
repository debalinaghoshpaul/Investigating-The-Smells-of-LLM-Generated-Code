import java.util.*;

public class RearrangeArrayWithSecondElementGreater {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
        rearrangeArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int i = 0, j = n-1, k = 0;

        while (i <= j) {
            if (i != j) {
                temp[k++] = nums[j--];
            }
            temp[k++] = nums[i++];
        }

        for (i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
