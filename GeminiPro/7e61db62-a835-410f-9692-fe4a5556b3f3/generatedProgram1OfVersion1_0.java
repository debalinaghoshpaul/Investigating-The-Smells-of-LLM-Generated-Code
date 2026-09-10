import java.util.LinkedList;

public class RemoveFirstAndLast {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Remove the first element
        list.removeFirst();

        // Remove the last element
        list.removeLast();

        // Print the modified list
        System.out.println(list);
    }
}
