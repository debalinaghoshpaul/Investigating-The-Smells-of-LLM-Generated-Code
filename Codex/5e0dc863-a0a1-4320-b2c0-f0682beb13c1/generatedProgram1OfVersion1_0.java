public class EvenOddThread {

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumberThread());
        Thread oddThread = new Thread(new OddNumberThread());

        evenThread.start();
        oddThread.start();
    }

    static class EvenNumberThread implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Number: " + i);
                }
            }
        }
    }

    static class OddNumberThread implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd Number: " + i);
                }
            }
        }
    }
}
