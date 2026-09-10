public class EvenOddThreadDemo {

    public static void main(String[] args) {
        // Create two threads, one for finding even numbers and one for finding odd numbers
        Thread evenThread = new Thread(new EvenThread());
        Thread oddThread = new Thread(new OddThread());

        // Start the threads
        evenThread.start();
        oddThread.start();
    }

    // Thread for finding and printing even numbers
    private static class EvenThread implements Runnable {

        @Override
        public void run() {
            // Find and print even numbers from 1 to 20
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even number: " + i);
                }
            }
        }
    }

    // Thread for finding and printing odd numbers
    private static class OddThread implements Runnable {

        @Override
        public void run() {
            // Find and print odd numbers from 1 to 20
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd number: " + i);
                }
            }
        }
    }
}
