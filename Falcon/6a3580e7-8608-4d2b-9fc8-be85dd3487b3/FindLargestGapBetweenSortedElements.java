import java.util.*;

public class FindLargestGapBetweenSortedElements {

    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {23, -2, 45, 38, 12, 4, 6};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Find the largest gap between sorted elements
        int largestGap = 0;
        for (int i = 1; i < arr.length; i++) {
            int gap = arr[i] - arr[i - 1];
            if (gap > largestGap) {
                largestGap = gap;
            }
        }

        // Print the largest gap
        System.out.println("Largest gap between sorted elements of the said array: " + largestGap);
    }
}
