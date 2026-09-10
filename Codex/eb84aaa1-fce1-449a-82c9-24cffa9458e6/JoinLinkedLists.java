import java.util.LinkedList;

public class JoinLinkedLists {
    public static void main(String[] args) {
        // Create the first linked list
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Create the second linked list
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Join the two linked lists
        LinkedList<Integer> joinedList = new LinkedList<>();
        joinedList.addAll(list1);
        joinedList.addAll(list2);

        // Print the joined list
        System.out.println("Joined List: " + joinedList);
    }
}
