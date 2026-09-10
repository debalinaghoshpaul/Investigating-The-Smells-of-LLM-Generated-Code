import java.util.LinkedList;

public class RemoveAllElementsLinkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");
        linkedList.add("C#");

        // Remove all elements from the linked list
        linkedList.clear();

        // Check if the linked list is empty
        if (linkedList.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }
    }
}

