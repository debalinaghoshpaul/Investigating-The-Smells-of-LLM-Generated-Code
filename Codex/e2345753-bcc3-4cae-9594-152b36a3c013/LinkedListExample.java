import java.util.LinkedList;

public class LinkedListExample {
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

        // Remove a specified element from the linked list
        String elementToRemove = "Banana";
        linkedList.remove(elementToRemove);

        // Print the modified linked list
        System.out.println("Modified Linked List: " + linkedList);
    }
}
