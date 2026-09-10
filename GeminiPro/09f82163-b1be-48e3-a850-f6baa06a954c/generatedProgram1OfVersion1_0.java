import java.util.*;

public class RetrieveElementFromArrayList {

    public static void main(String[] args) {
        // Create an array list
        List<Integer> numbers = new ArrayList<>();

        // Add some elements to the array list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Get the element at index 2
        int element = numbers.get(2);

        // Print the element
        System.out.println("The element at index 2 is: " + element);
    }
}
