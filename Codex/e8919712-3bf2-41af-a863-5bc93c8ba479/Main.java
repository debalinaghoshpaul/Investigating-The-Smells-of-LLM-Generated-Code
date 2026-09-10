import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);

        // Insert an element at the first position
        int element = 10;
        numbers.add(0, element);

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + numbers);
    }
}
