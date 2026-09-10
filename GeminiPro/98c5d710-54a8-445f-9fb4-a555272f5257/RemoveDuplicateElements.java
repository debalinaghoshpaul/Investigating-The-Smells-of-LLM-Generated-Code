import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 6};

        // Using HashSet to remove duplicate elements
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] newArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            newArr[index++] = num;
        }

        // Print the new array without duplicate elements
        System.out.println(Arrays.toString(newArr));
    }
}
