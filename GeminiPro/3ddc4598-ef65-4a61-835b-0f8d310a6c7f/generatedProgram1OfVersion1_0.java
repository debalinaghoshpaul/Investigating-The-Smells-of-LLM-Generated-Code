import java.util.ArrayList;

public class CopyArrayList {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> original = new ArrayList<>();

        // Add some elements to the ArrayList
        original.add("Red");
        original.add("Green");
        original.add("Blue");

        // Create a new ArrayList to copy the elements into
        ArrayList<String> copy = new ArrayList<>();

        // Copy the elements from the original ArrayList to the copy ArrayList
        for (String element : original) {
            copy.add(element);
        }

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + original);

        // Print the copy ArrayList
        System.out.println("Copy ArrayList: " + copy);
    }
}
