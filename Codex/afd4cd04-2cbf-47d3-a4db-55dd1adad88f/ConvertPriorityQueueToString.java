import java.util.PriorityQueue;

public class ConvertPriorityQueueToString {
    public static void main(String[] args) {
        // Create a Priority Queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the Priority Queue
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(2);

        // Convert Priority Queue to string representation
        String queueAsString = priorityQueue.toString();

        // Print the string representation
        System.out.println("Priority Queue as String: " + queueAsString);
    }
}
