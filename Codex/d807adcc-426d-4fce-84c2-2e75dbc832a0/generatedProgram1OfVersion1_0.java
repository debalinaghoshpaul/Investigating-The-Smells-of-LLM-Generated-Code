import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Increase the size of the ArrayList
        int newSize = numbers.size() + 3;
        for (int i = numbers.size(); i < newSize; i++) {
            numbers.add(i);
        }

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + numbers);
    }
}