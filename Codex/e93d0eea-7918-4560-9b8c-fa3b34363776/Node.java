// Java program to iterate through all elements in a linked list

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;

    // Function to insert a node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    // Function to insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }

    // Function to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to iterate through all elements in the list
    public void iterateThroughList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertAtBeginning(10);
        llist.insertAtEnd(20);
        llist.insertAtEnd(30);
        llist.insertAtEnd(40);
        llist.printList();
        llist.iterateThroughList();
    }
}
