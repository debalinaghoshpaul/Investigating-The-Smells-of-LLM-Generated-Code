import java.util.Arrays;

public class LargestAndSmallestInteger {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 3, 5, 6, 6, 8};

        // Create the largest integer
        Arrays.sort(nums);
        String largest = "";
        for (int i = nums.length - 1; i >= 0; i--) {
            largest += nums[i];
        }

        // Create the smallest integer
        Arrays.sort(nums);
        String smallest = "";
        for (int i = 0; i < nums.length; i++) {
            smallest += nums[i];
        }

        // Find the difference
        int difference = Integer.parseInt(largest) - Integer.parseInt(smallest);

        System.out.println("The difference between the largest and the smallest integer is: " + difference);
    }
}
