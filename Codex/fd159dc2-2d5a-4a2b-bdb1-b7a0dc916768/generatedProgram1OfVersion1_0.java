import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add(5);
        queue.add(3);
        queue.add(7);
        queue.add(1);
        queue.add(9);

        // Retrieve the first element
        Integer firstElement = queue.peek();

        // Print the first element
        System.out.println("First element: " + firstElement);
    }
}