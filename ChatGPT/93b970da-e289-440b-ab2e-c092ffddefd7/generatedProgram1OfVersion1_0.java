import java.util.concurrent.TimeUnit;

public class NanoTime {

    public static void main(String[] args) {
        // Start measuring time
        long startTime = System.nanoTime();

        // Execute the code you want to measure
        // ...

        // Stop measuring time
        long endTime = System.nanoTime();

        // Calculate and print the execution time in nanoseconds
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " ns");
    }
}
