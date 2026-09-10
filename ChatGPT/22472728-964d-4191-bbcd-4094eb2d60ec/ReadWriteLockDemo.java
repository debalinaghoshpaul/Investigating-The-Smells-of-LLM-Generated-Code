import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {

    private static Map<String, String> cache = new HashMap<>();
    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static String get(String key) {
        Lock readLock = lock.readLock();
        readLock.lock();
        try {
            return cache.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public static void put(String key, String value) {
        Lock writeLock = lock.writeLock();
        writeLock.lock();
        try {
            cache.put(key, value);
        } finally {
            writeLock.unlock();
        }
    }

    public static void main(String[] args) {
        // Read operation
        System.out.println(get("key1"));

        // Write operation
        put("key2", "value2");

        // Another read operation
        System.out.println(get("key2"));
    }
}
