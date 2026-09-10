import java.util.concurrent.Exchanger;

public class DataExchange {

    public static void main(String[] args) {
        // Create an Exchanger object
        Exchanger<String> exchanger = new Exchanger<>();

        // Create two threads
        Thread thread1 = new Thread(() -> {
            try {
                // Thread 1 exchanges data with Thread 2
                String data1 = "Hello from Thread 1";
                String data2 = exchanger.exchange(data1);
                System.out.println("Thread 1 received: " + data2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                // Thread 2 exchanges data with Thread 1
                String data1 = "Hello from Thread 2";
                String data2 = exchanger.exchange(data1);
                System.out.println("Thread 2 received: " + data2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
