import java.util.PriorityQueue;

public class CountElementsPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);

        // Get the number of elements in the PriorityQueue
        int size = pq.size();

        // Print the number of elements
        System.out.println("Number of elements in the PriorityQueue: " + size);
    }
}
