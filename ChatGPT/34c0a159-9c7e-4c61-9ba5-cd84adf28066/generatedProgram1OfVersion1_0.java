import java.util.Arrays;

public class ArraySorting {
    
    public static void main(String[] args) {
        
        // Numeric array
        int[] numericArray = {9, 3, 6, 1, 8, 2, 5, 4, 7};
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));
        
        // String array
        String[] stringArray = {"apple", "banana", "orange", "grapes", "kiwi"};
        System.out.println("\nOriginal String Array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
