// Java program to display elements and their positions in a linked list

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

    // Function to insert a node at the beginning of the linked list
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Function to display elements and their positions in the linked list
    void displayElementsAndPositions() {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            System.out.println("Element at position " + position + ": " + temp.data);
            temp = temp.next;
            position++;
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Insert some elements into the linked list
        ll.insertAtBeginning(10);
        ll.insertAtBeginning(20);
        ll.insertAtBeginning(30);
        ll.insertAtBeginning(40);

        // Display elements and their positions in the linked list
        ll.displayElementsAndPositions();
    }
}
