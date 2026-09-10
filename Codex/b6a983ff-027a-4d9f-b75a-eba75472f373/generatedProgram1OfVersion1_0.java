import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Retrieve and remove the first element
        if (!numbers.isEmpty()) {
            int firstElement = numbers.remove(0);
            System.out.println("First element: " + firstElement);
        } else {
            System.out.println("List is empty");
        }
    }
}