import java.util.LinkedList;

public class LinkedListComparison {
    public static void main(String[] args) {
        // Create the first linked list
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Create the second linked list
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Compare the two linked lists
        boolean isEqual = list1.equals(list2);

        // Print the result
        if (isEqual) {
            System.out.println("The linked lists are equal.");
        } else {
            System.out.println("The linked lists are not equal.");
        }
    }
}