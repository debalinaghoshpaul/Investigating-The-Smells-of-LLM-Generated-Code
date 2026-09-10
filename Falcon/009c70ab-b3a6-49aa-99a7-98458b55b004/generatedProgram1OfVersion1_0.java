import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("arr1 and arr2 are equal");
        } else {
            System.out.println("arr1 and arr2 are not equal");
        }
    }
}

