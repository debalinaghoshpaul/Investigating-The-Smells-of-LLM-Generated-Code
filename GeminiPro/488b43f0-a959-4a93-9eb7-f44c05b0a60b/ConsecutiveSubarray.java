import java.util.*;

public class ConsecutiveSubarray {

    public static void main(String[] args) {
        int[] nums = {2, 5, 0, 2, 1, 4, 3, 6, 1, 0};
        int[] result = findLargestConsecutiveSubarray(nums);

        if (result != null) {
            System.out.println("The largest sub-array is [" + result[0] + ", " + result[1] + "]");
            System.out.print("Elements of the sub-array: ");
            for (int i = result[0]; i <= result[1]; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("No consecutive sub-array found");
        }
    }

    public static int[] findLargestConsecutiveSubarray(int[] nums) {
        int startIndex = -1;
        int endIndex = -1;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int j = i + 1;
            while (j < nums.length && nums[j] == nums[j - 1] + 1) {
                count++;
                j++;
            }

            if (count > maxLength) {
                maxLength = count;
                startIndex = i;
                endIndex = j - 1;
            }
        }

        if (maxLength > 1) {
            return new int[]{startIndex, endIndex};
        } else {
            return null;
        }
    }
}
