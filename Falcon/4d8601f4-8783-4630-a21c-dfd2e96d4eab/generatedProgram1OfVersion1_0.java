import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

