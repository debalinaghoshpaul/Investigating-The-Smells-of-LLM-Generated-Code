import java.util.LinkedList;

public class GetLastElement {

    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");

        // Get the last element of the linked list
        String lastElement = linkedList.getLast();

        // Print the last element of the linked list
        System.out.println(lastElement); // Output: three
    }
}
