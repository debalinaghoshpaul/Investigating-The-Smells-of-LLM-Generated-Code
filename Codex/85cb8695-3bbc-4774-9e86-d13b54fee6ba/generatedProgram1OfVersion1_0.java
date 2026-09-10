import java.util.PriorityQueue;

public class ComparePriorityQueues {
    public static void main(String[] args) {
        // Create the first priority queue
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(5);
        pq1.add(2);
        pq1.add(8);
        
        // Create the second priority queue
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(3);
        pq2.add(7);
        pq2.add(1);
        
        // Compare the two priority queues
        boolean isEqual = pq1.equals(pq2);
        
        // Print the result
        if (isEqual) {
            System.out.println("The priority queues are equal.");
        } else {
            System.out.println("The priority queues are not equal.");
        }
    }
}