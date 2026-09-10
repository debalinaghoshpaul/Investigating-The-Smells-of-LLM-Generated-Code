import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert elements into the priority queue
        pq.offer(5);
        pq.offer(3);
        pq.offer(8);
        pq.offer(1);

        // Print the elements in the priority queue
        System.out.println("Priority Queue: " + pq);

        // Insert a given element into the priority queue
        int element = 10;
        pq.offer(element);

        // Print the elements in the priority queue after insertion
        System.out.println("Priority Queue after insertion: " + pq);
    }
}
