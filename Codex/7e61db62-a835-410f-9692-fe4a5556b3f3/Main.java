import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");
        linkedList.add("Element 4");

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Remove the first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();

        // Print the modified linked list
        System.out.println("Modified Linked List: " + linkedList);
    }
}
