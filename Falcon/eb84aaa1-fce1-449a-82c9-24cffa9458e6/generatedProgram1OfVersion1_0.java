import java.util.ArrayList;
import java.util.List;

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

    public Node removeFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    public Node removeLast() {
        Node temp = tail;
        tail = tail.next;
        return temp;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp!= null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void print() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);
        list.print();
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
        System.out.println(list.size());
    }
}
