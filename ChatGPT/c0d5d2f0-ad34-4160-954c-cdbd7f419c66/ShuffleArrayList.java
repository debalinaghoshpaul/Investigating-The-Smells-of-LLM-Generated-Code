import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Bob");
        names.add("Alice");

        // Shuffle the ArrayList
        Collections.shuffle(names);

        // Print the shuffled ArrayList
        System.out.println(names);
    }
}
