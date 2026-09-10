import java.util.Collections;

public class ArrayListExample {
    
    public static void main(String[] args) {
        // Create an array list
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add elements to the array list
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);
        
        // Sort the array list
        Collections.sort(numbers);
        
        // Print the sorted array list
        System.out.println("Sorted array list: ");
        for(int num : numbers) {
            System.out.println(num);
        }
    }

}