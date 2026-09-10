import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Convert linked list to array list
        List<String> arrayList = new ArrayList<>(linkedList);

        // Print the array list
        System.out.println("Array List: " + arrayList);
    }
}