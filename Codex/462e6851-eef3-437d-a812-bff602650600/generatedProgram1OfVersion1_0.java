import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");
        linkedList.add("Element 4");
        linkedList.add("Element 5");

        // Specify the starting position
        int startPosition = 2;

        // Get the list iterator
        ListIterator<String> iterator = linkedList.listIterator(startPosition);

        // Iterate through the elements starting at the specified position
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}