public class ProducerConsumer {
    private static final int BUFFER_SIZE = 5;
    private static int[] buffer = new int[BUFFER_SIZE];
    private static int count = 0;

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                produce(i);
            }
        }

        private void produce(int value) {
            synchronized (buffer) {
                while (count == BUFFER_SIZE) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                buffer[count] = value;
                count++;
                System.out.println("Produced: " + value);

                buffer.notify();
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                consume();
            }
        }

        private void consume() {
            synchronized (buffer) {
                while (count == 0) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int value = buffer[count - 1];
                count--;
                System.out.println("Consumed: " + value);

                buffer.notify();
            }
        }
    }
}
