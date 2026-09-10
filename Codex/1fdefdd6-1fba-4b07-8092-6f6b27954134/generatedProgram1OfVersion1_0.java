import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTaskExample {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        // Task to be scheduled
        Runnable task = () -> {
            System.out.println("Task executed at: " + System.currentTimeMillis());
        };

        // Schedule the task to run after 3 seconds
        executor.schedule(task, 3, TimeUnit.SECONDS);

        // Schedule the task to run after an initial delay of 2 seconds and then repeat every 5 seconds
        executor.scheduleAtFixedRate(task, 2, 5, TimeUnit.SECONDS);

        // Shutdown the executor after 20 seconds
        executor.schedule(() -> executor.shutdown(), 20, TimeUnit.SECONDS);
    }
}
