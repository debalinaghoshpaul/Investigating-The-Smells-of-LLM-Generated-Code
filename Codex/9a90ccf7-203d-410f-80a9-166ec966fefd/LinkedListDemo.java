import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Display elements and their positions
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Element at position " + i + ": " + linkedList.get(i));
        }
    }
}
