import java.util.*;

public class LinkedList<T extends Comparable<T>> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addSorted(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null || data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null && data.compareTo(current.next.data) >= 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    // Other methods (remove, getSize, findNode, etc.) go here

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addSorted(5);
        list.addSorted(2);
        list.addSorted(7);
        list.addSorted(1);
        list.addSorted(9);

        // Print the list
        Node<Integer> current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}