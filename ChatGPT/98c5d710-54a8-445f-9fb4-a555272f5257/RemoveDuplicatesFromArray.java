import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 4};

        System.out.println("Original Array: " + Arrays.toString(array));

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int value : array) {
            set.add(value);
        }

        int[] newArray = new int[set.size()];
        int index = 0;
        for (int value : set) {
            newArray[index++] = value;
        }

        System.out.println("Array with duplicates removed: " + Arrays.toString(newArray));
    }
}
