import java.util.concurrent.TimeUnit;

public class MeasureCodeExecutionTime {

    public static void main(String[] args) {
        // Get the start time in nanoseconds
        long startTime = System.nanoTime();

        // Execute the code that you want to measure
        // ...

        // Get the end time in nanoseconds
        long endTime = System.nanoTime();

        // Calculate the execution time in nanoseconds
        long executionTime = endTime - startTime;

        // Convert the execution time to milliseconds
        double executionTimeInMilliseconds = executionTime / 1000000.0;

        // Print the execution time
        System.out.println("Execution time: " + executionTimeInMilliseconds + " milliseconds");
    }
}
