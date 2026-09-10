import java.util.Arrays;

public class ArrayContains4or7 {

    public static boolean contains4or7(int[] arr) {
        for (int num : arr) {
            if (num == 4 || num == 7) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 7};
        System.out.println(contains4or7(arr1)); // true

        int[] arr2 = {1, 2, 3};
        System.out.println(contains4or7(arr2)); // false

        int[] arr3 = {4};
        System.out.println(contains4or7(arr3)); // true

        int[] arr4 = {7};
        System.out.println(contains4or7(arr4)); // true

        int[] arr5 = {};
        System.out.println(contains4or7(arr5)); // false

        int[] arr6 = null;
        System.out.println(contains4or7(arr6)); // false
    }
}
