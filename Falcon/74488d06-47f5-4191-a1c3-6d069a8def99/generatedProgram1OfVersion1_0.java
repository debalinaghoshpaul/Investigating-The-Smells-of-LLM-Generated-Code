import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] arr = {5, 7};
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4 || arr[i] == 7) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

