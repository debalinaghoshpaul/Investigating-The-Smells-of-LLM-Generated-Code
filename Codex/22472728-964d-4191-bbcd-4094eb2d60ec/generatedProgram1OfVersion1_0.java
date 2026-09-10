import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    private String data = "Initial Data";
    private ReadWriteLock rwLock = new ReentrantReadWriteLock();

    public String readData() {
        rwLock.readLock().lock();
        try {
            return data;
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public void writeData(String newData) {
        rwLock.writeLock().lock();
        try {
            data = newData;
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Runnable readTask = () -> {
            System.out.println("Reading Data: " + sharedResource.readData());
        };

        Runnable writeTask = () -> {
            sharedResource.writeData("New Data");
            System.out.println("Data has been written.");
        };

        Thread writerThread = new Thread(writeTask);
        Thread readerThread1 = new Thread(readTask);
        Thread readerThread2 = new Thread(readTask);

        writerThread.start();
        readerThread1.start();
        readerThread2.start();
    }
}