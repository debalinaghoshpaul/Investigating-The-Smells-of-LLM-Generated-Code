import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    private int value;
    private final ReentrantLock lock = new ReentrantLock();

    public int getValue() {
        lock.lock();
        try {
            return value;
        } finally {
            lock.unlock();
        }
    }

    public void setValue(int value) {
        lock.lock();
        try {
            this.value = value;
        } finally {
            lock.unlock();
        }
    }
}
