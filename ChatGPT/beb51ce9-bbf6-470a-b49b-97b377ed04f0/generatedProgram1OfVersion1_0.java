import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("cherry");

        // Comparing two array lists
        boolean isEqual = list1.equals(list2);

        if(isEqual) {
            System.out.println("The two array lists are equal.");
        } else {
            System.out.println("The two array lists are not equal.");
        }
    }
}
