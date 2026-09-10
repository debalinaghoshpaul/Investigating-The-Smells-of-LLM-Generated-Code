import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {
        
        // Create an array list
        List<Integer> originalList = new ArrayList<>();
        originalList.add(5);
        originalList.add(2);
        originalList.add(8);
        originalList.add(1);
        originalList.add(3);
        
        // Copy the original array list to a new array list
        List<Integer> copiedList = new ArrayList<>(originalList);
        
        // Print the original array list
        System.out.println("Original array list: " + originalList);
        
        // Print the copied array list
        System.out.println("Copied array list: " + copiedList);
    }
}
