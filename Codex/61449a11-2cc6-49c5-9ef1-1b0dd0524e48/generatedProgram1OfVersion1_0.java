import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert elements at the first position
        linkedList.addFirst("Element 1");
        linkedList.addFirst("Element 2");
        linkedList.addFirst("Element 3");

        // Insert elements at the last position
        linkedList.addLast("Element 4");
        linkedList.addLast("Element 5");
        linkedList.addLast("Element 6");

        // Print the linked list
        System.out.println("Linked List: " + linkedList);
    }
}