import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] nums = { 6, 1, 2, 5, 4, 3 };

        // Find the maximum value in the array
        int max = Arrays.stream(nums).max().getAsInt();

        // Create an output array to store the sorted numbers
        int[] sortedNums = new int[nums.length];

        // Create a count array to store the count of each number
        int[] count = new int[max + 1];

        // Initialize the count array with zeros
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        // Store the count of each number in the count array
        for (int num : nums) {
            count[num]++;
        }

        // Update the count array to store the actual positions of each number in the output array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build the sorted array
        for (int i = nums.length - 1; i >= 0; i--) {
            sortedNums[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }

        // Print the sorted array
        System.out.println(Arrays.toString(sortedNums));
    }
}
