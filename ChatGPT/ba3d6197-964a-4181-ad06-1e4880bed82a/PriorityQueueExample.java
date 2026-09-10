import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a priority queue with a custom comparator
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Reverse the order of the elements
                return o2 - o1;
            }
        });

        // Insert a given element into the priority queue
        priorityQueue.offer(5);
        priorityQueue.offer(3);
        priorityQueue.offer(7);

        // Print the elements of the priority queue
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
