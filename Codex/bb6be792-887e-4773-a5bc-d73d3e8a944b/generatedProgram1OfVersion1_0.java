import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Create the first priority queue
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(5);
        queue1.add(3);
        queue1.add(8);
        
        // Create the second priority queue
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        
        // Add all elements from queue1 to queue2
        queue2.addAll(queue1);
        
        // Print the elements of queue2
        System.out.println("Elements of queue2: " + queue2);
    }
}