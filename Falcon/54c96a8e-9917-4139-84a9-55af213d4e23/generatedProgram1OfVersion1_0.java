class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        newNode.next = tail;
        tail = newNode;
    }

    public int getFirst() {
        Node current = head;
        while (current!= null) {
            if (current.data == data) {
                return current.data;
            }
            current = current.next;
        }
        return -1;
    }

    public int getLast() {
        Node current = tail;
        while (current!= null) {
            if (current.data == data) {
                return current.data;
            }
            current = current.next;
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
