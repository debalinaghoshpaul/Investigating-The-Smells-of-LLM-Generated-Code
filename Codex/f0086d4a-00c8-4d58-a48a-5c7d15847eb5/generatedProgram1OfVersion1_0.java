import java.util.concurrent.CountDownLatch;

public class SynchronizedThreads {
    public static void main(String[] args) {
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch finishSignal = new CountDownLatch(3);

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Worker(startSignal, finishSignal));
            thread.start();
        }

        System.out.println("Starting all threads...");
        startSignal.countDown();

        try {
            finishSignal.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished executing.");
    }

    static class Worker implements Runnable {
        private final CountDownLatch startSignal;
        private final CountDownLatch finishSignal;

        public Worker(CountDownLatch startSignal, CountDownLatch finishSignal) {
            this.startSignal = startSignal;
            this.finishSignal = finishSignal;
        }

        @Override
        public void run() {
            try {
                startSignal.await();
                System.out.println("Thread started: " + Thread.currentThread().getName());
                // Do some work here
                finishSignal.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
