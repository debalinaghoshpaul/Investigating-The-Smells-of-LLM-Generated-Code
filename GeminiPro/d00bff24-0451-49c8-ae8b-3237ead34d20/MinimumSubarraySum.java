import java.util.Scanner;

public class MinimumSubarraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input array
        System.out.println("Enter the array elements:");
        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        // Get the subarray size
        System.out.println("Enter the subarray size:");
        int subarraySize = scanner.nextInt();

        // Find the minimum subarray sum
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length - subarraySize + 1; i++) {
            currentSum = 0;
            for (int j = i; j < i + subarraySize; j++) {
                currentSum += nums[j];
            }
            if (currentSum < minSum) {
                minSum = currentSum;
            }
        }

        // Print the minimum subarray sum
        System.out.println("Minimum subarray sum of size " + subarraySize + " is: " + minSum);
    }
}
