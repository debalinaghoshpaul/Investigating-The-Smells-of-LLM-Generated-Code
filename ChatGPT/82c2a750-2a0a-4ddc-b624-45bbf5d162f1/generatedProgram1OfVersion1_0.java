import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        
        // Convert ArrayList to array
        String[] array = arrayList.toArray(new String[arrayList.size()]);
        
        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
