import java.util.concurrent.Semaphore;

class SharedResource {
    Semaphore semaphore;

    public SharedResource() {
        semaphore = new Semaphore(1); // Initialize semaphore with 1 permit
    }

    public void performOperation() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " is performing the operation");
            Thread.sleep(2000); // Simulating some operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " has completed the operation");
        }
    }
}

class Worker implements Runnable {
    SharedResource sharedResource;

    public Worker(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        sharedResource.performOperation();
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(new Worker(sharedResource), "Thread 1");
        Thread thread2 = new Thread(new Worker(sharedResource), "Thread 2");

        thread1.start();
        thread2.start();
    }
}
