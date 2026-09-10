import java.util.ArrayList;

public class ReplaceSecondElement {

    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // replace the second element with "Orange"
        list.set(1, "Orange");

        // print the ArrayList
        System.out.println(list);
    }
}
