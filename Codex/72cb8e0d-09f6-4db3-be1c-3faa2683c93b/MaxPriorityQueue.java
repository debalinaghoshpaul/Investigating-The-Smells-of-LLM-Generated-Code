import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(10);

        // Convert PriorityQueue to maximum priority queue
        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>(priorityQueue.size(), (a, b) -> b - a);
        maxPriorityQueue.addAll(priorityQueue);

        // Print the elements of the maximum priority queue
        while (!maxPriorityQueue.isEmpty()) {
            System.out.println(maxPriorityQueue.poll());
        }
    }
}
