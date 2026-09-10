import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Print the original linked list
        System.out.println("Original linked list: " + linkedList);

        // Insert an element at a specified position
        String elementToInsert = "New Element";
        int position = 1;
        linkedList.add(position, elementToInsert);

        // Print the modified linked list
        System.out.println("Modified linked list: " + linkedList);
    }
}