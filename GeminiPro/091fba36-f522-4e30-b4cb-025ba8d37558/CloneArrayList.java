import java.util.ArrayList;

public class CloneArrayList {

    public static void main(String[] args) {
        // Create an array list
        ArrayList<String> originalList = new ArrayList<>();

        // Add some elements to the array list
        originalList.add("Item 1");
        originalList.add("Item 2");
        originalList.add("Item 3");

        // Clone the array list
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

        // Print the original array list
        System.out.println("Original array list: " + originalList);

        // Print the cloned array list
        System.out.println("Cloned array list: " + clonedList);
    }
}
