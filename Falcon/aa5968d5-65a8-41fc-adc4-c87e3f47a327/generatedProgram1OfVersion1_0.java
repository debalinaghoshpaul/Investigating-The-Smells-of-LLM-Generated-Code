import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(n);
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        for (int i = n - 1; i > 0; i--) {
            int max = pq.poll();
            int left = pq.poll();
            int right = pq.poll();
            pq.add(max);
            pq.add(left);
            pq.add(right);
        }
        System.out.println(Arrays.toString(pq.toArray()));
    }
}

// 