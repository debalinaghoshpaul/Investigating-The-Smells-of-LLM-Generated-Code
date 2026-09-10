import java.util.concurrent.atomic.AtomicInteger;

public class SumOfPrimes {

    public static void main(String[] args) {
        int limit = 1000; // Define the limit for prime numbers
        int numThreads = 4; // Define the number of threads to use

        AtomicInteger sum = new AtomicInteger(0);

        Thread[] threads = new Thread[numThreads];
        int increment = limit / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * increment + 1;
            int end = (i == numThreads - 1) ? limit : (i + 1) * increment;
            threads[i] = new Thread(new PrimeCalculator(start, end, sum));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of all prime numbers up to " + limit + " is: " + sum);
    }

    static class PrimeCalculator implements Runnable {
        private int start;
        private int end;
        private AtomicInteger sum;

        public PrimeCalculator(int start, int end, AtomicInteger sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
        }

        @Override
        public void run() {
            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    sum.getAndAdd(num);
                }
            }
        }

        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
