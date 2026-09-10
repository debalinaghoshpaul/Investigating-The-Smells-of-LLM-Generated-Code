import java.util.Arrays;

public class Test {
    public static <T> boolean checkArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};
        Integer[] array3 = {1, 2, 3, 4, 6};

        System.out.println(checkArrays(array1, array2)); // Output: true
        System.out.println(checkArrays(array1, array3)); // Output: false
    }
}
