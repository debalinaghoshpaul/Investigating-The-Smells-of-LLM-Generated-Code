// Import necessary Java classes.
import java.util.Scanner;
import java.util.Arrays;

// Define the 'Main' class.
public class Main {
  // Define the main method for running the program.
  public static void main(String[] args) {
    // Initialize an array of numbers.
    int[] nums = {1, -2, -5, -4, 3, -6};
    // Alternative input arrays:
    // int[] nums = {1, 2, 5, -4, 3, -6};
    // int[] nums = {1, 2, -5, -4, -3, 6};
    System.out.printf("\nOriginal array of numbers:\n" + Arrays.toString(nums));

    // Call the 'test' method to check for negative dominance in the array.
    boolean result = test(nums);
    System.out.printf("\nCheck Negative Dominance in the said array! " + result);
  }

  // Define the 'test' method to check for negative dominance in the array.
  public static boolean test(int[] nums) {
    long count_negative, count_positive;
    // Remove duplicate values from the 'nums' array using the 'distinct' method.
    nums = Arrays.stream(nums).distinct().toArray();
    // Count the number of negative and positive elements in the array.
    count_negative = Arrays.stream(nums).filter(s -> s < 0).count();
    count_positive = Arrays.stream(nums).filter(s -> s > 0).count();
    // Return 'true' if there are more negative elements, indicating negative dominance.
    return count_negative > count_positive;
  }
}