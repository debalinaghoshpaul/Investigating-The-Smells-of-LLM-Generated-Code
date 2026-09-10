import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
    public static void main(String[] args) {
        // Create a new ExecutorService with a fixed thread pool size of 1
        ExecutorService executor = Executors.newFixedThreadPool(1);
        
        // Create a Callable task that returns a result of type String
        Callable<String> callableTask = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000); // Simulate a time-consuming task
                return "Callable task completed";
            }
        };
        
        // Submit the Callable task to the ExecutorService
        Future<String> future = executor.submit(callableTask);
        
        // Perform other tasks while waiting for the result
        System.out.println("Main thread is doing something else...");
        
        try {
            // Get the result of the Callable task once it's completed
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        
        // Shut down the ExecutorService
        executor.shutdown();
    }
}
