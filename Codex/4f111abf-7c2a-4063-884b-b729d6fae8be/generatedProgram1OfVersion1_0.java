public class SharedCounter {
    private static int counter = 0;

    public static void main(String[] args) {
        int numThreads = 5;
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new CounterTask());
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final Counter Value: " + counter);
    }

    static class CounterTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                synchronized (SharedCounter.class) {
                    counter++;
                }
            }
        }
    }
}
