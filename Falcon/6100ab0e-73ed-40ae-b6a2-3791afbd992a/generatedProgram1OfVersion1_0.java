import java.util.ArrayList;

public class JoinArrayLists {

    public static void main(String[] args) {
        // Create two array lists
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Dog");
        list2.add("Cat");
        list2.add("Fish");

        // Join the two array lists
        list1.addAll(list2);

        // Print the joined array list
        System.out.println(list1);
    }
}
