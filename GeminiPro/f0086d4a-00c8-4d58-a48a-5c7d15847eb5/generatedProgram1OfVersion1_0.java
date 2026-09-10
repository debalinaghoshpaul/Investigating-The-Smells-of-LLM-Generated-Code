import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) {
        // Create a CountDownLatch object with a count of 3
        CountDownLatch startLatch = new CountDownLatch(3);
        CountDownLatch finishLatch = new CountDownLatch(3);

        // Create three threads and pass them the start and finish latches
        Thread thread1 = new Thread(new Worker(startLatch, finishLatch));
        Thread thread2 = new Thread(new Worker(startLatch, finishLatch));
        Thread thread3 = new Thread(new Worker(startLatch, finishLatch));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to start
        try {
            startLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for all threads to finish
        try {
            finishLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // All threads have finished
        System.out.println("All threads have finished");
    }

    // Worker class
    private static class Worker implements Runnable {

        private final CountDownLatch startLatch;
        private final CountDownLatch finishLatch;

        public Worker(CountDownLatch startLatch, CountDownLatch finishLatch) {
            this.startLatch = startLatch;
            this.finishLatch = finishLatch;
        }

        @Override
        public void run() {
            // Wait for the start latch to be released
            try {
                startLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Do some work
            System.out.println("Thread " + Thread.currentThread().getName() + " is doing work");

            // Release the finish latch
            finishLatch.countDown();
        }
    }
}
