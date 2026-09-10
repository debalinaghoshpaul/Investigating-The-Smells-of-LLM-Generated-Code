import java.util.ArrayList;
import java.util.List;

public class ExtractArrayListPortion {
    public static void main(String[] args) {
        // Create an ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Extract a portion of the ArrayList
        List<Integer> portion = numbers.subList(1, 4);

        // Print the extracted portion
        System.out.println("Extracted portion: " + portion);
    }
}
