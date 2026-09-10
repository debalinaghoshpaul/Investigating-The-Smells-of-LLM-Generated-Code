import java.util.Arrays;

public class FindTwoElements {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        int target = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum -= arr[i];
            }
        }

        if (target == sum) {
            System.out.println("Elements are: " + Arrays.toString(arr));
        } else {
            System.out.println("Elements are: " + Arrays.toString(arr));
        }
    }
}

