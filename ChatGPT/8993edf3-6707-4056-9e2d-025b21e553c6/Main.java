class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void deleteNode(int position) {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head;
        if(position == 0) {
            head = temp.next;
            return;
        }
        
        for(int i=0; temp!=null && i<position-1; i++) {
            temp = temp.next;
        }
        
        if(temp == null || temp.next == null) {
            System.out.println("Position is greater than number of nodes in the list");
            return;
        }
        
        Node next = temp.next.next;
        temp.next = next;
    }
    
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        
        int positionToDelete = 3;
        System.out.println("Original Linked List:");
        list.display();
        
        System.out.println("After deleting node at position " + positionToDelete + ":");
        list.deleteNode(positionToDelete);
        list.display();
    }
}
