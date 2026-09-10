import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListFromSpecifiedPosition {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Get an iterator for the LinkedList
        ListIterator<Integer> iterator = list.listIterator();

        // Specify the starting position
        int position = 2;

        // Iterate through the LinkedList starting from the specified position
        while (iterator.hasNext()) {
            if (iterator.nextIndex() >= position) {
                System.out.println(iterator.next());
            }
        }
    }
}
