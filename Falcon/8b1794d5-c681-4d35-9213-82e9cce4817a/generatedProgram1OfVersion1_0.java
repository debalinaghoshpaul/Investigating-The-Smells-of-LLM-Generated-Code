import java.util.Arrays;

public class UpdateArrayElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 6;
        int index = 2;
        arr[index] = element;
        System.out.println(Arrays.toString(arr));
    }
}

