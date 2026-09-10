import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};
        int[] newArray = new int[2];
        newArray[0] = array1[0];
        newArray[1] = array1[1];
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}

