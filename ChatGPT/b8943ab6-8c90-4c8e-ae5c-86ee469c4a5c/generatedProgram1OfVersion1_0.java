import java.util.LinkedList;

public class LinkedListInsertAtPos {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        linkedList.add("Yellow");
        linkedList.add("Orange");

        // Print the original LinkedList
        System.out.println("Original LinkedList: " + linkedList);

        // Insert the element "Pink" at position 2
        linkedList.add(2, "Pink");

        // Print the modified LinkedList
        System.out.println("Modified LinkedList: " + linkedList);
    }
}
