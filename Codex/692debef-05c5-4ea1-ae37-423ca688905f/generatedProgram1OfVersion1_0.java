import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Reverse the ArrayList
        Collections.reverse(numbers);

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList: " + numbers);
    }
}