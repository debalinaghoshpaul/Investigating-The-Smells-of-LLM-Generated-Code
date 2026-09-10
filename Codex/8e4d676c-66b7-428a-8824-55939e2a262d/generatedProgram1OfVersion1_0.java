import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        // Print the original list
        System.out.println("Original List: " + numbers);
        
        // Swap elements at index 1 and 3
        Collections.swap(numbers, 1, 3);
        
        // Print the modified list
        System.out.println("Modified List: " + numbers);
    }
}