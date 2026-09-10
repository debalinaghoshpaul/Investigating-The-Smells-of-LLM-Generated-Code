class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    // Function to remove and return the first element of the linked list
    Node removeFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        return temp;
    }
}
