
public class ConcurrentMapExample {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding elements to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Accessing the map concurrently using multiple threads
        Runnable task1 = () -> {
            for (String key : map.keySet()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            }
        };

        Runnable task2 = () -> {
            for (String key : map.keySet()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
} 

In this program, we create a ConcurrentHashMap and add elements to it. We then create two Runnable tasks that access the map concurrently using multiple threads. Each thread will iterate over the keys in the map and print out the corresponding values. Finally, we create two threads using these tasks and start them to demonstrate concurrent access to the map.
