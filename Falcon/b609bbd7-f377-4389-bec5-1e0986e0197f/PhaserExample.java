import java.util.concurrent.Phaser;

public class PhaserExample {

    public static void main(String[] args) {
        // Create a Phaser with 4 parties
        Phaser phaser = new Phaser(4);

        // Create and start 4 threads
        Thread t1 = new Thread(new Task(phaser, "Thread 1"));
        Thread t2 = new Thread(new Task(phaser, "Thread 2"));
        Thread t3 = new Thread(new Task(phaser, "Thread 3"));
        Thread t4 = new Thread(new Task(phaser, "Thread 4"));
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for all threads to finish
        phaser.arriveAndAwaitAdvance();
        System.out.println("All threads have finished");
    }

    private static class Task implements Runnable {

        private final Phaser phaser;
        private final String name;

        public Task(Phaser phaser, String name) {
            this.phaser = phaser;
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(name + " is doing task " + i);
                phaser.arriveAndAwaitAdvance();
            }
        }
    }
}
