import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {
    public static void main(String[] args) {
        // Create the first ArrayList
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Create the second ArrayList
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Join the two ArrayLists
        List<Integer> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        // Print the joined ArrayList
        System.out.println("Joined ArrayList: " + joinedList);
    }
}
