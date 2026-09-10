import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 4;
        int element = 7;
        arr[index] = element;
        System.out.println(Arrays.toString(arr));
    }
}

