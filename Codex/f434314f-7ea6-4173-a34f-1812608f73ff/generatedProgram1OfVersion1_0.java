import java.util.ArrayList;

public class SearchArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        // Element to search
        int element = 30;
        
        // Search for the element in the ArrayList
        boolean found = numbers.contains(element);
        
        // Print the result
        if (found) {
            System.out.println("Element " + element + " found in the ArrayList.");
        } else {
            System.out.println("Element " + element + " not found in the ArrayList.");
        }
    }
}