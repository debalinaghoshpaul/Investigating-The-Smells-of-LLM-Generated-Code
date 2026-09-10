import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");
        list.add("JavaScript");

        // Reverse the ArrayList using Collections.reverse()
        Collections.reverse(list);

        // Print the reversed ArrayList
        System.out.println(list);
    }
}
