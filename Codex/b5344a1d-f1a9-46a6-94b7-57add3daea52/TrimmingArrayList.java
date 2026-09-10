import java.util.ArrayList;

public class TrimmingArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Before trimming: " + numbers);

        // Trim the capacity of the ArrayList
        numbers.trimToSize();

        System.out.println("After trimming: " + numbers);
    }
}
