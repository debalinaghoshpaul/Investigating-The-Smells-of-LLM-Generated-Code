import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        // Shuffle the elements in the ArrayList
        Collections.shuffle(numbers);
        
        // Print the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + numbers);
    }
}
