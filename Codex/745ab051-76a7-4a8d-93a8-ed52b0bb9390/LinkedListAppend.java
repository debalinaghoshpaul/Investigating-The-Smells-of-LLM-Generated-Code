import java.util.LinkedList;

public class LinkedListAppend {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Append an element to the end of the linked list
        String elementToAppend = "New Element";
        linkedList.addLast(elementToAppend);

        // Print the updated linked list
        System.out.println("Updated Linked List: " + linkedList);
    }
}
