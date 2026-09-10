import java.util.Arrays;

public class NegativeDominance {
    public static void main(String[] args) {
        int[] arr = {1, -2, -5, -4, 3, -6};
        boolean result = negativeDominance(arr);
        System.out.println(result);
    }

    public static boolean negativeDominance(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

