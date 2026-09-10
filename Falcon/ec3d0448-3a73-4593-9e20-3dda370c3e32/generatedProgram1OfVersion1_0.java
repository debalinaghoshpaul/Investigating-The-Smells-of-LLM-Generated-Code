import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}

// 