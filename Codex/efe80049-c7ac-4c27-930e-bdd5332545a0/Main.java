import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // Print the original list
        System.out.println("Original List: " + list);

        // Replace the second element with a new element
        String newElement = "New Element";
        list.set(1, newElement);

        // Print the updated list
        System.out.println("Updated List: " + list);
    }
}
