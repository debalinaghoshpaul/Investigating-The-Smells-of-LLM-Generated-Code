
public class ThreadSafeQueueExample {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Adding elements to the queue using multiple threads
        Runnable producer1 = () -> {
            for (int i = 0; i < 5; i++) {
                queue.add("Element " + i + " from Thread 1");
            }
        };

        Runnable producer2 = () -> {
            for (int i = 0; i < 5; i++) {
                queue.add("Element " + i + " from Thread 2");
            }
        };

        Thread thread1 = new Thread(producer1);
        Thread thread2 = new Thread(producer2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Removing and printing elements from the queue
        Runnable consumer = () -> {
            String element;
            while ((element = queue.poll()) != null) {
                System.out.println("Removed: " + element);
            }
        };

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

        try {
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}