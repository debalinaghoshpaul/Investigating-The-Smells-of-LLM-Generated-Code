import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7};
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Length of the original array: " + n);
        System.out.println("After removing duplicates, the new length of the array is: " + n);
    }
}

