import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add colors to the priority queue
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");

        // Print out the elements of the priority queue
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}