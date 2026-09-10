import java.util.LinkedList;

public class LinkedListOccurrences {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(20);
        linkedList.add(40);
        linkedList.add(20);
        linkedList.add(50);

        // Specify the element to find its occurrences
        int element = 20;

        // Find the first occurrence
        int firstIndex = linkedList.indexOf(element);

        // Find the last occurrence
        int lastIndex = linkedList.lastIndexOf(element);

        // Print the results
        System.out.println("First occurrence of " + element + " is at index: " + firstIndex);
        System.out.println("Last occurrence of " + element + " is at index: " + lastIndex);
    }
}
