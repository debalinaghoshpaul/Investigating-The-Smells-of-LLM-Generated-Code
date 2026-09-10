import java.util.Arrays;

public class BucketSort {

    // Sort the array using bucket sort
    public static void sort(int[] arr) {
        // Find the maximum value in the array
        int max = Arrays.stream(arr).max().getAsInt();

        // Create a bucket for each possible value in the array
        int[] buckets = new int[max + 1];

        // Distribute the elements of the array into the buckets
        for (int i = 0; i < arr.length; i++) {
            buckets[arr[i]]++;
        }

        // Sort each bucket individually
        for (int i = 0; i < buckets.length; i++) {
            Arrays.sort(arr, i, i + buckets[i]);
        }
    }

    // Test the bucket sort algorithm
    public static void main(String[] args) {
        // Create an array of integers to sort
        int[] arr = {5, 3, 1, 7, 4, 1, 2, 8, 6};

        // Sort the array using bucket sort
        sort(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

}
