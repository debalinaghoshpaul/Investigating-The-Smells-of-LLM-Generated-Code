class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void deleteNode(Node node) {
        if (head == null) {
            return;
        }

        if (head == node) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        } else {
            Node prev = null;
            Node curr = head;
            while (curr.next != head) {
                prev = curr;
                curr = curr.next;
                if (curr == node) {
                    prev.next = curr.next;
                    break;
                }
            }
        }
    }

    public int findWinner(int n) {
        if (head == null || n <= 0) {
            return -1;
        }

        Node curr = head;
        while (curr.next != curr) {
            for (int i = 1; i < 3; i++) {
                curr = curr.next;
            }
            deleteNode(curr);
        }

        return curr.data;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 6; // Number of suitors
        CircularLinkedList list = new CircularLinkedList();

        for (int i = 1; i <= n; i++) {
            list.addNode(i);
        }

        int winner = list.findWinner(n);
        System.out.println("The position to stand in to marry the princess is: " + winner);
    }
}