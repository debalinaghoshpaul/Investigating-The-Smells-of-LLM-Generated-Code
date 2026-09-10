import java.util.PriorityQueue;

public class PriorityQueueToArray {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(2);

        // Convert the priority queue to an array
        Integer[] array = priorityQueue.toArray(new Integer[0]);

        // Print the elements of the array
        for (Integer element : array) {
            System.out.print(element + " ");
        }
    }
}
