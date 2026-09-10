import java.util.Arrays;
import java.util.Collections;

public class KLargestElements {
    public static void main(String[] args) {
        int[] array = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;

        Arrays.sort(array);
        
        // Reverse the sorted array
        Integer[] reversedArray = Arrays.stream(array).boxed()
                                         .sorted(Collections.reverseOrder())
                                         .toArray(Integer[]::new);
        
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.print(k + " largest elements of the said array are: ");
        for (int i = 0; i < k; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
