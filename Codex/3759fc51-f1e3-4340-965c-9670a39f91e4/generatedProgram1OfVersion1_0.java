import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        // Element to be inserted at the end
        int element = 4;

        // Insert the element at the end of the linked list
        linkedList.addLast(element);

        // Print the updated linked list
        System.out.println("Linked list after inserting element: " + linkedList);
    }
}