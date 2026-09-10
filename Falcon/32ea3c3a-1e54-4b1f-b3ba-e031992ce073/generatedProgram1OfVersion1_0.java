import java.util.Arrays;

public class Multiplication {
    public static void main(String[] args) {
        int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};
        int result = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                result += array1[i] * array2[j];
            }
        }

        System.out.println("Result: " + result);
    }
}

// 