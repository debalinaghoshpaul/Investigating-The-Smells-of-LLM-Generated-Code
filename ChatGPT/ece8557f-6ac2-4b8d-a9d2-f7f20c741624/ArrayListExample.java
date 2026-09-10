
public class ArrayListExample {

    public static void main(String[] args) {
        // Create an array list
        ArrayList<String> colors = new ArrayList<>();

        // Add elements to the array list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Printing the array list before removing the third element
        System.out.println("Array List before removing the third element: " + colors);

        // Remove the third element from the array list
        if(colors.size() > 2) {
            colors.remove(2);
            // Printing the array list after removing the third element
            System.out.println("Array List after removing the third element: " + colors);
        }
        else {
            System.out.println("Array List does not have a third element to remove.");
        }

        // Search for an element in the array list
        String searchElement = "Green";
        if(colors.contains(searchElement)) {
            System.out.println("Element '" + searchElement + "' found in the array list at index " + colors.indexOf(searchElement));
        } else {
            System.out.println("Element '" + searchElement + "' not found in the array list.");
        }
    }
}
