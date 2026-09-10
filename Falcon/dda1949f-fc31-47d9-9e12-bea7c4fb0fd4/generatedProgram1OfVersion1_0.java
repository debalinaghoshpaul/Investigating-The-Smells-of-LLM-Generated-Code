import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        // Create a semaphore with an initial permit count of 1
        Semaphore semaphore = new Semaphore(1);

        // Create a thread that will acquire a permit from the semaphore and then sleep for 10 seconds
        Thread thread1 = new Thread(() -> {
            try {
                // Acquire a permit from the semaphore
                semaphore.acquire();

                // Simulate a task that takes 10 seconds to complete
                System.out.println("Thread 1 acquired the semaphore and is performing a long task...");
                Thread.sleep(10000);

                // Release the permit back to the semaphore
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create a thread that will acquire a permit from the semaphore and then sleep for 5 seconds
        Thread thread2 = new Thread(() -> {
            try {
                // Acquire a permit from the semaphore
                semaphore.acquire();

                // Simulate a task that takes 5 seconds to complete
                System.out.println("Thread 2 acquired the semaphore and is performing a short task...");
                Thread.sleep(5000);

                // Release the permit back to the semaphore
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
