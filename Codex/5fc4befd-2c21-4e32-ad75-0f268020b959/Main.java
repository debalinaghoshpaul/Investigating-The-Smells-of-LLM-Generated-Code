import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Retrieve the first element of the linked list
        String firstElement = linkedList.getFirst();

        // Print the first element
        System.out.println("First Element: " + firstElement);
    }
}
