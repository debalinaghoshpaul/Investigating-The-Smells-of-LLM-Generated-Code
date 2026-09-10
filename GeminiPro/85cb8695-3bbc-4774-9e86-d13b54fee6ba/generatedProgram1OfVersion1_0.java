import java.util.*;

public class ComparePriorityQueues {

    public static void main(String[] args) {
        // Create two priority queues
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        // Add some elements to the priority queues
        pq1.add(1);
        pq1.add(3);
        pq1.add(5);

        pq2.add(2);
        pq2.add(4);
        pq2.add(6);

        // Compare the two priority queues using the compareTo() method
        int comparisonResult = pq1.compareTo(pq2);

        // Print the comparison result
        if (comparisonResult == 0) {
            System.out.println("The two priority queues are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("The first priority queue is smaller than the second priority queue.");
        } else {
            System.out.println("The first priority queue is larger than the second priority queue.");
        }
    }
}
