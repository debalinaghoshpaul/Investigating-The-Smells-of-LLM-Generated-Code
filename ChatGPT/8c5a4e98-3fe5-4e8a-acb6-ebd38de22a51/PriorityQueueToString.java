import java.util.PriorityQueue;

public class PriorityQueueToString {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        // Add elements to the priority queue
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);
        
        // Convert the priority queue elements to string representations
        String elementsToString = priorityQueue.toString();
        
        // Print the string representation of the priority queue
        System.out.println("Priority Queue Elements: " + elementsToString);
    }
}
