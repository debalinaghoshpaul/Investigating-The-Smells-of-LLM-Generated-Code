import java.util.LinkedList;

public class LinkedListEmptyCheck {
    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Check if the linked list is empty
        if (linkedList.isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            System.out.println("Linked list is not empty");
        }
    }
}
