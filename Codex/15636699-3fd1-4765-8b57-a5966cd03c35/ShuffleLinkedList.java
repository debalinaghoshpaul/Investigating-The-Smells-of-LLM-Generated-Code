import java.util.LinkedList;
import java.util.Collections;

public class ShuffleLinkedList {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // Shuffle the elements in the linked list
        Collections.shuffle(linkedList);

        // Print the shuffled linked list
        System.out.println("Shuffled Linked List: " + linkedList);
    }
}
