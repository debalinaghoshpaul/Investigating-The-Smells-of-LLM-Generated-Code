import java.util.LinkedList;

public class DoubleEndedQueue<T> {
    private LinkedList<T> deque;

    public DoubleEndedQueue() {
        deque = new LinkedList<>();
    }

    public void addFirst(T element) {
        deque.addFirst(element);
    }

    public void addLast(T element) {
        deque.addLast(element);
    }

    public T removeFirst() {
        return deque.removeFirst();
    }

    public T removeLast() {
        return deque.removeLast();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int size() {
        return deque.size();
    }

    public void printQueue() {
        System.out.println(deque);
    }

    public static void main(String[] args) {
        DoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();
        queue.addFirst(1);
        queue.addLast(2);
        queue.addFirst(3);
        queue.addLast(4);

        System.out.println("Queue size: " + queue.size());
        queue.printQueue();

        System.out.println("Removed element from the front: " + queue.removeFirst());
        System.out.println("Removed element from the rear: " + queue.removeLast());

        System.out.println("Queue size: " + queue.size());
        queue.printQueue();
    }
}
