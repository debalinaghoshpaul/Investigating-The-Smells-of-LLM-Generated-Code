import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {

    public static void main(String[] args) {
        // Create a ScheduledExecutorService
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        // Schedule a task to run after 5 seconds
        executorService.schedule(() -> System.out.println("Task 1 executed"), 5, TimeUnit.SECONDS);

        // Schedule a task to run every 2 seconds, starting after 10 seconds
        executorService.scheduleAtFixedRate(() -> System.out.println("Task 2 executed"), 10, 2, TimeUnit.SECONDS);

        // Wait for 20 seconds to allow the tasks to run
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}
