import java.util.LinkedList;

public class CopyLinkedList {

    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // Create a new linked list to copy the elements
        LinkedList<Integer> list2 = new LinkedList<>();

        // Copy the elements from list1 to list2
        for (Integer element : list1) {
            list2.add(element);
        }

        // Print the original linked list
        System.out.println("Original linked list: " + list1);

        // Print the copied linked list
        System.out.println("Copied linked list: " + list2);
    }
}
