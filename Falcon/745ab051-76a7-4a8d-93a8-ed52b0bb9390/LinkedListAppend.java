import java.util.LinkedList;

public class LinkedListAppend {

    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");

        // Append an element to the end of the linked list
        linkedList.add("Yellow");

        // Print the linked list
        System.out.println(linkedList);
    }
}
