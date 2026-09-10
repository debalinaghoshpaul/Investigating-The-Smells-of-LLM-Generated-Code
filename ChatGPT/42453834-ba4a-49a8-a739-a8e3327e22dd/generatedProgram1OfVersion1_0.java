import java.util.Random;

public class LinkedListCount {
    
    public static void main(String[] args) {
        Node<Integer> front = null;
        
        // Generate 20 random numbers in range 0-4 and insert them at the front of the linked list
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = rand.nextInt(5); // Generate random number in range 0-4
            front = new Node<>(randomNumber, front);
        }
        
        // Output the list
        System.out.println("Linked List: " + toString(front));
        
        // Count the occurrences of each value from 0 to 4 in the list
        for (int i = 0; i < 5; i++) {
            int count = countValue(front, i);
            System.out.println("Occurrences of " + i + ": " + count);
        }
    }
    
    public static <T> int countValue(Node<T> front, Object item) {
        int count = 0;
        Node<T> current = front;
        while (current != null) {
            if (current.getData().equals(item)) {
                count++;
            }
            current = current.getNext();
        }
        return count;
    }
    
    public static <T> String toString(Node<T> front) {
        StringBuilder sb = new StringBuilder();
        Node<T> current = front;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return sb.toString().trim();
    }
}

class Node<T> {
    private T data;
    private Node<T> next;
    
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    
    public T getData() {
        return data;
    }
    
    public Node<T> getNext() {
        return next;
    }
}
