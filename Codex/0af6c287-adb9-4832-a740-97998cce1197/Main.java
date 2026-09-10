import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        // Retrieve the last element of the linked list
        int lastElement = linkedList.getLast();

        // Print the last element
        System.out.println("Last Element: " + lastElement);
    }
}
