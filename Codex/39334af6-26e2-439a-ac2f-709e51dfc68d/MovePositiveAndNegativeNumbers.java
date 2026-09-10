import java.util.*;

public class MovePositiveAndNegativeNumbers {

    public static void main(String[] args) {
        int[] arr = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
        movePositiveAndNegativeNumbers(arr);
        System.out.println("Result: " + Arrays.toString(arr));
    }

    public static void movePositiveAndNegativeNumbers(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] < 0) {
                if (arr[j] > 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
    }
}
