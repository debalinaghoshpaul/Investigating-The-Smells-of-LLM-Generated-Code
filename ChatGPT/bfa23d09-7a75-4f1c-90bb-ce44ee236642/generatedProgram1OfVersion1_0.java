import java.util.Arrays;

public class ArrangeIntegers {

    public static void main(String[] args) {
        int[] nums = {3, -1, 5, -2, 7, -4, 0, -9};
        
        rearrangeArray(nums);
        
        // Display the rearranged array
        System.out.println("Rearranged Array: " + Arrays.toString(nums));
    }
    
    public static void rearrangeArray(int[] nums) {
        int i = 0, j = nums.length - 1;
        
        while (i < j) {
            if (nums[i] < 0 && nums[j] >= 0) {
                // Swap elements if i is negative and j is positive
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else {
                if (nums[i] >= 0) {
                    i++;
                }
                if (nums[j] < 0) {
                    j--;
                }
            }
        }
    }
}
