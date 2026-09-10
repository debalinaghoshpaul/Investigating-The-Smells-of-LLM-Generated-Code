import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        
        // Add elements to the ArrayList
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        
        // Print the original ArrayList
        System.out.println("Original ArrayList: " + list);
        
        // Remove the third element
        if (list.size() >= 3) {
            list.remove(2);
            System.out.println("Third element removed.");
        } else {
            System.out.println("ArrayList does not have a third element.");
        }
        
        // Print the modified ArrayList
        System.out.println("Modified ArrayList: " + list);
    }
}