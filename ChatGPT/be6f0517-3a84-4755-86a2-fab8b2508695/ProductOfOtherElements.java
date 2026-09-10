import java.util.Arrays;

public class ProductOfOtherElements {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 7};
        
        int[] result1 = getProductArray(nums1);
        int[] result2 = getProductArray(nums2);
        
        System.out.println("Array with product of every other element: " + Arrays.toString(result1));
        System.out.println("Array with product of every other element: " + Arrays.toString(result2));
    }
    
    public static int[] getProductArray(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];
        
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }
        
        return result;
    }
}
