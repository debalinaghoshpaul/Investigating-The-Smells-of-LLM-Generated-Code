import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumPriorityQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add(5);
        queue.add(10);
        queue.add(20);
        queue.add(15);
        queue.add(2);

        System.out.println("Original PriorityQueue: " + queue);

        // Create a maximum priority queue by using reverseOrder() method from the Collections class
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        maxQueue.addAll(queue);

        System.out.println("Maximum PriorityQueue: " + maxQueue);
    }
}
