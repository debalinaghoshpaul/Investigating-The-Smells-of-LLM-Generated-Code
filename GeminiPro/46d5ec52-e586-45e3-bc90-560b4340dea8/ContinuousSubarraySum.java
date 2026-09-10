import java.util.Scanner;

public class ContinuousSubarraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the target sum
        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();

        // Find the total number of continuous subarrays whose sum equals the target sum
        int count = findContinuousSubarraySum(arr, n, target);

        // Print the result
        System.out.println("The total number of continuous subarrays whose sum equals " + target + " is: " + count);
    }

    // Function to find the total number of continuous subarrays whose sum equals the target sum
    public static int findContinuousSubarraySum(int[] arr, int n, int target) {
        int count = 0;
        int sum = 0;

        // Iterate over the array
        for (int i = 0; i < n; i++) {
            // Add the current element to the sum
            sum += arr[i];

            // Check if the sum equals the target sum
            if (sum == target) {
                // Increment the count
                count++;

                // Reset the sum to zero
                sum = 0;
            }

            // Check if the sum exceeds the target sum
            else if (sum > target) {
                // Reset the sum to zero
                sum = 0;

                // Decrement the count
                count--;
            }
        }

        // Return the count
        return count;
    }
}
