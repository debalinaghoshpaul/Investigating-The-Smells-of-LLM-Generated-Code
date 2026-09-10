import java.util.*;

public class FindKLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;

        // Find the k largest elements
        int[] largestElements = findKLargestElements(arr, k);

        // Print the k largest elements
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println(k + " largest elements of the said array are: " + Arrays.toString(largestElements));
    }

    public static int[] findKLargestElements(int[] arr, int k) {
        // Create a priority queue (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add the first k elements to the priority queue
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        // Iterate over the remaining elements in the array
        for (int i = k; i < arr.length; i++) {
            // If the current element is greater than the smallest element in the priority queue
            if (arr[i] > pq.peek()) {
                // Remove the smallest element from the priority queue
                pq.remove();

                // Add the current element to the priority queue
                pq.add(arr[i]);
            }
        }

        // Convert the priority queue to an array
        int[] largestElements = new int[k];
        for (int i = 0; i < k; i++) {
            largestElements[i] = pq.remove();
        }

        return largestElements;
    }
}
