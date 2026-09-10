import java.util.LinkedList;

public class RemoveElementFromLinkedList {

    public static void main(String[] args) {
        // create a linked list
        LinkedList<Integer> list = new LinkedList<>();

        // add some elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // print the original list
        System.out.println("Original list: " + list);

        // remove the element at index 2
        list.remove(2);

        // print the modified list
        System.out.println("Modified list: " + list);
    }
}
