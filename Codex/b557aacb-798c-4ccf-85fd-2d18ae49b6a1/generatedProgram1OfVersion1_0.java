import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Insert an element at the front of the linked list
        int element = 10;
        linkedList.addFirst(element);

        // Print the updated linked list
        System.out.println("Linked list after inserting element at the front: " + linkedList);
    }
}