import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

class SleepSort {
    public static void main(String[] args) throws Exception {
        int[] numbers = {3, 1, 4, 2, 5};
        ExecutorService executor = Executors.newFixedThreadPool(numbers.length);
        Map<Integer, Integer> sortedNumbers = new HashMap<>();
        AtomicInteger count = new AtomicInteger(0);
        for (int number : numbers) {
            executor.execute(() -> {
                try {
                    Thread.sleep(number * 1000); // Sleep for the number of milliseconds specified by the key
                    synchronized (sortedNumbers) {
                        sortedNumbers.put(count.getAndIncrement(), number);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println(sortedNumbers.values().stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}
