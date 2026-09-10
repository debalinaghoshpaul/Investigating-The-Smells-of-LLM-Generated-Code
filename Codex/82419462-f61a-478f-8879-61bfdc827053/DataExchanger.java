
public class DataExchanger {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread producerThread = new Thread(() -> {
            try {
                String message = "Hello from Producer";
                System.out.println("Producer sending message: " + message);
                String receivedMessage = exchanger.exchange(message);
                System.out.println("Producer received message: " + receivedMessage);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                String message = "Hello from Consumer";
                System.out.println("Consumer sending message: " + message);
                String receivedMessage = exchanger.exchange(message);
                System.out.println("Consumer received message: " + receivedMessage);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
