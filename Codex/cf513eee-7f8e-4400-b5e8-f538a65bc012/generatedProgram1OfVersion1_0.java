import java.util.LinkedList;

public class LinkedListInsertion {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Display the original linked list
        System.out.println("Original linked list: " + linkedList);

        // Insert an element at a specified position
        String element = "Grapes";
        int position = 2;
        linkedList.add(position, element);

        // Display the modified linked list
        System.out.println("Modified linked list: " + linkedList);
    }
}