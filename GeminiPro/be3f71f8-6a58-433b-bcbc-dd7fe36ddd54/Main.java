import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        // Create a thread-safe queue using ConcurrentLinkedQueue
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        // Create a producer thread
        Thread producer = new Thread(() -> {
            // Add elements to the queue
            for (int i = 0; i < 10; i++) {
                queue.offer(i);
                System.out.println("Produced: " + i);
            }
        });

        // Create a consumer thread
        Thread consumer = new Thread(() -> {
            // Remove and consume elements from the queue
            while (!queue.isEmpty()) {
                Integer element = queue.poll();
                if (element != null) {
                    System.out.println("Consumed: " + element);
                }
            }
        });

        // Start the producer and consumer threads
        producer.start();
        consumer.start();

        // Wait for the threads to finish
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
