
public class PhaserExample {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3); // 3 threads will be participating

        Thread t1 = new Thread(new MyThread(phaser, "Thread 1"));
        Thread t2 = new Thread(new MyThread(phaser, "Thread 2"));
        Thread t3 = new Thread(new MyThread(phaser, "Thread 3"));

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to arrive at this phaser before moving on
        phaser.arriveAndAwaitAdvance();

        System.out.println("All threads have finished their tasks");
    }

    static class MyThread implements Runnable {
        private Phaser phaser;
        private String name;

        public MyThread(Phaser phaser, String name) {
            this.phaser = phaser;
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " is doing some task");
            phaser.arriveAndDeregister();
        }
    }
} 

In this program, we create a Phaser object with 3 threads participating. Each thread performs a task and then arrives at the phaser. The main thread waits for all threads to arrive at the phaser before proceeding. Finally, a message is printed indicating that all threads have finished their tasks.