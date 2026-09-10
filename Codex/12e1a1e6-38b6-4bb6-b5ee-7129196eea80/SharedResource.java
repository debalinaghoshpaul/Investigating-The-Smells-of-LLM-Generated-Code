import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    private ReentrantLock lock = new ReentrantLock();
    private int count = 0;

    public void increment() {
        lock.lock();
        try {
            count++;
            System.out.println("Incremented to: " + count);
        } finally {
            lock.unlock();
        }
    }

    public void decrement() {
        lock.lock();
        try {
            count--;
            System.out.println("Decremented to: " + count);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.decrement();
            }
        });

        thread1.start();
        thread2.start();
    }
}
