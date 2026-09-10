import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the priority queue
        pq.add(5);
        pq.add(3);
        pq.add(8);
        pq.add(1);
        pq.add(10);

        System.out.println("Priority Queue before removing elements: " + pq);

        // Remove all elements from the priority queue
        pq.clear();

        System.out.println("Priority Queue after removing elements: " + pq);
    }
}
