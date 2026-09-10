import java.util.Arrays;

public class TwoElementsSumClosestToZero {

    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};
        int n = arr.length;

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Initialize the closest sum and the two elements
        int closestSum = Integer.MAX_VALUE;
        int[] closestPair = new int[2];

        // Iterate over the array
        for (int i = 0; i < n-1; i++) {
            // Find the sum of the current element and the next element
            int sum = arr[i] + arr[i+1];

            // Check if the sum is closer to zero than the current closest sum
            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                closestPair[0] = arr[i];
                closestPair[1] = arr[i+1];
            }
        }

        // Print the closest pair
        System.out.println("The closest pair is: " + closestPair[0] + ", " + closestPair[1]);
    }
}
