// Import necessary Java classes.
import java.util.Scanner;
import java.util.Arrays;

// Define the 'Main' class.
public class Main {
  // Define the main method for running the program.
  public static void main(String[] args) {
    // Initialize an array of numbers.
    int[] nums = {1, 2 ,5, 0, 4, 3, 6};
    // int[] nums = {1, 2 ,5, 0, 3, 6, 7};
    System.out.printf("\nOriginal array: " + Arrays.toString(nums));

    // Call the 'test' method to check for consecutive numbers in the array.
    boolean result = test(nums);
    System.out.printf("\nCheck consecutive numbers in the said array! " + result);
  }

  // Define the 'test' method to check for consecutive numbers in the array.
  public static boolean test(int[] nums) {
    // Sort the 'nums' array in ascending order.
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      // Check if the current number and the next number are consecutive.
      if (nums[i] + 1 != nums[i + 1])
        return false;
    }
    return true;
  }
}