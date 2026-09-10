import java.util.ArrayList;
import java.util.Arrays;

public class StoreItems {
    public static void main(String[] args) {
        // Create an ArrayList to store the items
        ArrayList<String> items = new ArrayList<>();

        // Add items to the list
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        items.add("Item 4");
        items.add("Item 5");

        // Display the items in the list
        System.out.println("Items in the list:");
        for (String item : items) {
            System.out.println(item);
        }

        // Fetch the current number of elements available in the list
        int numElements = items.size();
        System.out.println("Number of elements in the list: " + numElements);

        // Check for a particular item in the list
        String searchItem = "Item 3";
        boolean containsItem = items.contains(searchItem);
        System.out.println("List contains " + searchItem + ": " + containsItem);

        // Replace an item in the list with a new item
        String oldItem = "Item 4";
        String newItem = "New Item";
        int index = items.indexOf(oldItem);
        if (index != -1) {
            items.set(index, newItem);
            System.out.println("Replaced " + oldItem + " with " + newItem);
        } else {
            System.out.println(oldItem + " not found in the list");
        }

        // Convert the ArrayList to an Array
        String[] itemsArray = items.toArray(new String[0]);

        // Display the items in the array
        System.out.println("Items in the array:");
        for (String item : itemsArray) {
            System.out.println(item);
        }
    }
}