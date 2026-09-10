
public class ArrayListOperations {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Insert an element at the first position
        numbers.add(0, 5);
        System.out.println("Element inserted at the first position: " + numbers);

        // Retrieve an element from a specified index
        int index = 2;
        if(index < numbers.size()) {
            int element = numbers.get(index);
            System.out.println("Element at position " + index + ": " + element);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}
