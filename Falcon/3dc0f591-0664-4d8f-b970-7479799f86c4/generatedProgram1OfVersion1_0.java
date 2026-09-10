import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementToRemove = 5;
        int index = Arrays.binarySearch(arr, elementToRemove);
        if (index!= -1) {
            arr.remove(index);
        }
        System.out.println(Arrays.toString(arr));
    }
}

// 