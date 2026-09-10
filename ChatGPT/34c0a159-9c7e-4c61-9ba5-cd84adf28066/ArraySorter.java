import java.util.Arrays;

public class ArraySorter {
    
    public static void main(String[] args) {
        // Sorting a numeric array
        int[] numericArray = {5, 2, 9, 1, 5, 6};
        Arrays.sort(numericArray);
        
        System.out.println("Sorted Numeric Array: ");
        for(int num : numericArray) {
            System.out.print(num + " ");
        }
        
        // Sorting a string array
        String[] stringArray = {"apple", "orange", "banana", "grape", "kiwi"};
        Arrays.sort(stringArray);
        
        System.out.println("\n\nSorted String Array: ");
        for(String str : stringArray) {
            System.out.print(str + " ");
        }
    }
}
