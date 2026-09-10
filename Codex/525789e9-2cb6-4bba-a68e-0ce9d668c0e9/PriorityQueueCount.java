import java.util.PriorityQueue;

public class PriorityQueueCount {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the priority queue
        pq.add(5);
        pq.add(10);
        pq.add(3);
        pq.add(8);

        // Get the number of elements in the priority queue
        int count = pq.size();

        // Print the count
        System.out.println("Number of elements in the priority queue: " + count);
    }
}
