import java.util.LinkedList;

public class LinkedListCopy {
    public static void main(String[] args) {
        // Create the original linked list
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        // Create a new linked list to copy the original list
        LinkedList<Integer> copiedList = new LinkedList<>(originalList);

        // Print the original list
        System.out.println("Original List: " + originalList);

        // Print the copied list
        System.out.println("Copied List: " + copiedList);
    }
}