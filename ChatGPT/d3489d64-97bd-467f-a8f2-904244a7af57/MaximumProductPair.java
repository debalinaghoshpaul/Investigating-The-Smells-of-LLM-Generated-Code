import java.util.*;

public class MaximumProductPair {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        int[] result = findMaximumProductPair(nums);
        System.out.println("Pair is (" + result[0] + ", " + result[1] + "), Maximum Product: " + result[2]);
    }

    public static int[] findMaximumProductPair(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("The array must contain at least two elements.");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        int maxProduct = Math.max(max1 * max2, min1 * min2);

        if (maxProduct == max1 * max2) {
            return new int[]{max1, max2, maxProduct};
        } else {
            return new int[]{min1, min2, maxProduct};
        }
    }
}
