
public class SharedResource {
    private int resource;
    private final StampedLock lock = new StampedLock();

    public void writeResource(int newValue) {
        long stamp = lock.writeLock();
        try {
            this.resource = newValue;
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    public int readResource() {
        long stamp = lock.tryOptimisticRead();
        int value = this.resource;
        if (!lock.validate(stamp)) {
            stamp = lock.readLock();
            try {
                value = this.resource;
            } finally {
                lock.unlockRead(stamp);
            }
        }
        return value;
    }

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Write to shared resource
        sharedResource.writeResource(42);

        // Read from shared resource
        int value = sharedResource.readResource();
        System.out.println("Value read from shared resource: " + value);
    }
}
