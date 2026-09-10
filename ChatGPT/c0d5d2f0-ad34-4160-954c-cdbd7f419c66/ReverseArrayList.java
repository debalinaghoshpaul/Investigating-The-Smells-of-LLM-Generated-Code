import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        // create an array list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // print original array list
        System.out.println("Original array list: " + numbers);

        // reverse elements in the array list
        Collections.reverse(numbers);

        // print reversed array list
        System.out.println("Reversed array list: " + numbers);
    }
}
