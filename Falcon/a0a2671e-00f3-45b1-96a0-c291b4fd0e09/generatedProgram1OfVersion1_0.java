import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int x = 10;
        int y = 20;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result++;
            }
            if (arr[i] == y) {
                result++;
            }
            if (arr[i] == x && arr[i] == y) {
                result++;
            }
        }
        System.out.println("Result: " + result);
    }
}

