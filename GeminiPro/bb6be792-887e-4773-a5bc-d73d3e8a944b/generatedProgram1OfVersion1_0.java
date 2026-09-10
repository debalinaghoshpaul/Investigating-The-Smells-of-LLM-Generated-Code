import java.util.*;

public class AddAllElementsOfPriorityQueue {

    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        // Add elements to the priority queue
        pq1.add(1);
        pq1.add(2);
        pq1.add(3);
        pq1.add(4);
        pq1.add(5);

        // Create another priority queue
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        // Add all the elements of pq1 to pq2
        pq2.addAll(pq1);

        // Print the elements of pq2
        System.out.println(pq2);
    }
}
