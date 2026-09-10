
public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Iterate through all elements in the ArrayList
        System.out.println("Iterating through all elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Insert an element into the ArrayList at the first position
        numbers.add(0, 5);

        // Print the ArrayList after insertion
        System.out.println("\nArrayList after inserting an element at the first position:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
