import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result++;
            }
        }

        if (result == 1) {
            System.out.println("The number 10 in the array exceeds 20.");
        } else if (result == 2) {
            System.out.println("The number 10 is present in the array.");
        } else {
            System.out.println("The number 10 is not present in the array.");
        }
    }
}

