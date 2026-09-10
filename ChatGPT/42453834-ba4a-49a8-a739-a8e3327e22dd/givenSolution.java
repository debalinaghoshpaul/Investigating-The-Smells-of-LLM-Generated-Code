import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Node<Integer> front = null;
        Random rand = new Random();

        // Generate 20 random numbers and insert each number at the front of a Linked List
        for (int i = 0; i < 20; i++) {
            int num = rand.nextInt(5);
            front = new Node<>(num, front);
        }

        // Output the list using toString(front) in the Nodes class
        System.out.println(Nodes.toString(front));

        // In a loop, call the method countValue(), and display the number of occurrences of each value from 0 to 4 in the list
        for (int i = 0; i < 5; i++) {
            System.out.println("Number " + i + " occurs " + countValue(front, i) + " times.");
        }
    }

    public static <T> int countValue(Node<T> front, Object item) {
        int count = 0;
        Node<T> current = front;
        while (current != null) {
            if (current.data.equals(item)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}

class Nodes {
    public static <T> String toString(Node<T> front) {
        StringBuilder sb = new StringBuilder();
        Node<T> current = front;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}