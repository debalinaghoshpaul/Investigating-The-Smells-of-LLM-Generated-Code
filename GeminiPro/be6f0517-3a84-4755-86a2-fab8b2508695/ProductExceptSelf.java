import java.util.*;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        // Create an array to store the products of all elements to the left
        int[] leftProducts = new int[nums.length];
        // Create an array to store the products of all elements to the right
        int[] rightProducts = new int[nums.length];

        // Calculate the products of all elements to the left
        leftProducts[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        // Calculate the products of all elements to the right
        rightProducts[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        // Calculate the products of all elements except self
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] nums3 = {1, 0, 3, 4, 5, 6, 7};
        int[] nums4 = {};

        int[] result1 = productExceptSelf(nums1);
        int[] result2 = productExceptSelf(nums2);
        int[] result3 = productExceptSelf(nums3);
        int[] result4 = productExceptSelf(nums4);

        // Print the results
        System.out.println("Array with product of every other element: " + Arrays.toString(result1));
        System.out.println("Array with product of every other element: " + Arrays.toString(result2));
        System.out.println("Array with product of every other element: " + Arrays.toString(result3));
        System.out.println("Array with product of every other element: " + Arrays.toString(result4));
    }
}
