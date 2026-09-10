import java.util.LinkedList;

public class InsertElementAtSpecifiedPosition {

    public static void main(String[] args) {
        // create a linked list
        LinkedList<String>linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");

        // print the original linked list
        System.out.println("Original linked list: " + linkedList);

        // insert an element at the specified position
        linkedList.add(2, "Fig");

        // print the linked list after insertion
        System.out.println("Linked list after insertion: " + linkedList);
    }
}
