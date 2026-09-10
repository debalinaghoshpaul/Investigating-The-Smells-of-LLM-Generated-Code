
public class ArrayListExample {

    public static void main(String[] args) {
        
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        
        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        
        // Retrieve an element at a specified index
        int index = 2;
        if(index >= 0 && index < fruits.size()) {
            String element = fruits.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Invalid index");
        }
        
        // Update an element by the given element
        String newElement = "Pineapple";
        index = 3;
        if(index >= 0 && index < fruits.size()) {
            fruits.set(index, newElement);
            System.out.println("Updated element at index " + index + " with: " + newElement);
        } else {
            System.out.println("Invalid index");
        }
        
        // Display the updated ArrayList
        System.out.println("Updated ArrayList: " + fruits);
    }

}