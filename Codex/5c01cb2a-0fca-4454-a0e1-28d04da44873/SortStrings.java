import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Orange");
        strings.add("Grapes");

        // Sorting the list using lambda expression
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));

        // Printing the sorted list
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
