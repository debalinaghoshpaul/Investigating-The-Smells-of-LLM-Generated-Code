import java.util.PriorityQueue;

public class PriorityQueueToString {

    public static void main(String[] args) {
        // Create a Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the Priority Queue
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        // Convert the Priority Queue to a String
        String pqString = pq.toString();

        // Print the String representation of the Priority Queue
        System.out.println(pqString);
    }
}
