import java.util.LinkedList;

public class LinkedListSwap {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");
        linkedList.add("Element 4");

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Swap elements at index 1 and 2
        int index1 = 1;
        int index2 = 2;
        swapElements(linkedList, index1, index2);

        // Print the modified linked list
        System.out.println("Modified Linked List: " + linkedList);
    }

    public static void swapElements(LinkedList<String> linkedList, int index1, int index2) {
        // Get the elements to be swapped
        String element1 = linkedList.get(index1);
        String element2 = linkedList.get(index2);

        // Swap the elements
        linkedList.set(index1, element2);
        linkedList.set(index2, element1);
    }
}
