import java.util.PriorityQueue;

public class MedianOfWindow {

    public static void findMedian(int[] arr, int k) {
        PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> upperHalf = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            lowerHalf.add(arr[i]);
        }

        for (int i = 0; i <= arr.length - k; i++) {
            for (int j = 0; j < k; j++) {
                upperHalf.add(lowerHalf.poll());
                lowerHalf.add(arr[i + j]);
            }

            System.out.println("Median: " + lowerHalf.peek());

            for (int j = 0; j < k; j++) {
                lowerHalf.add(upperHalf.poll());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        findMedian(arr, k);
    }
}
