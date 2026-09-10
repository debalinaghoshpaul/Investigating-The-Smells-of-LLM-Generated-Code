import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    public static void main(String[] args) throws InterruptedException {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        lock.readLock().lock();
        System.out.println("Read lock acquired");
        lock.writeLock().lock();
        System.out.println("Write lock acquired");
        lock.readLock().unlock();
        lock.writeLock().unlock();
        lock.readLock().lock();
        System.out.println("Read lock acquired");
        lock.writeLock().lock();
        System.out.println("Write lock acquired");
        lock.readLock().unlock();
        lock.writeLock().unlock();
    }
}

