class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLinkedLists {
    
    public Node mergeLists(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node curr = dummy;
        
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        
        if (head1 != null) {
            curr.next = head1;
        }
        if (head2 != null) {
            curr.next = head2;
        }
        
        return dummy.next;
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        MergeSortedLinkedLists merger = new MergeSortedLinkedLists();
        
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        
        Node mergedHead = merger.mergeLists(head1, head2);
        
        System.out.println("Merged List:");
        merger.printList(mergedHead);
    }
}
