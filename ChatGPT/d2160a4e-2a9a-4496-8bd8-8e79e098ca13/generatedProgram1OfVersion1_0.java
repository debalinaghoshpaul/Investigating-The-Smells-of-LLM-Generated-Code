import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an array list
        ArrayList<String> colors = new ArrayList<>();
        
        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        // Print out the collection
        System.out.println("Colors in the list:");
        for(String color : colors) {
            System.out.println(color);
        }
        
        // Iterate through all elements in the array list
        System.out.println("\nIterating through all elements:");
        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
