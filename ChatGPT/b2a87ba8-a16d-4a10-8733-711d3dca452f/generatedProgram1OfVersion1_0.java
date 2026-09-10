import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListToArrayList {

    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        // Convert the linked list to an array list
        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        // Print the array list
        System.out.println(arrayList);
    }
}
