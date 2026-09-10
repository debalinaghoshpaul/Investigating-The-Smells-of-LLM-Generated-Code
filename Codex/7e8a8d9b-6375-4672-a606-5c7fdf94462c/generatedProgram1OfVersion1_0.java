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

        // Element to search
        String elementToSearch = "Banana";

        // Check if the element exists in the linked list
        boolean exists = linkedList.contains(elementToSearch);

        // Print the result
        if (exists) {
            System.out.println(elementToSearch + " exists in the linked list.");
        } else {
            System.out.println(elementToSearch + " does not exist in the linked list.");
        }
    }
}