import java.util.LinkedList;

public class ReplaceElementInLinkedList {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Replace an element at a specific index
        int index = 2; // Index of the element to be replaced
        String newElement = "Grapes"; // New element to replace with
        linkedList.set(index, newElement);

        // Print the modified linked list
        System.out.println("Modified Linked List: " + linkedList);
    }
}