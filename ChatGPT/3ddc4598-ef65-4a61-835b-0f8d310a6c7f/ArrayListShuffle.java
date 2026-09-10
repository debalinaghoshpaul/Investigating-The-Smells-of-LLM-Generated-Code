import java.util.Collections;

public class ArrayListShuffle {
    public static void main(String[] args) {
        
        // Creating an ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Grapes");
        
        // Creating a new ArrayList to store shuffled elements
        ArrayList<String> shuffledList = new ArrayList<>(originalList);
        
        // Shuffling the elements in the new ArrayList
        Collections.shuffle(shuffledList);
        
        // Displaying the original and shuffled ArrayLists
        System.out.println("Original List: " + originalList);
        System.out.println("Shuffled List: " + shuffledList);
    }
}
