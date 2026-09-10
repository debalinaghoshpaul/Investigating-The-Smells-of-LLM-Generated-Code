import java.util.Arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int secondSmallest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second smallest element is: " + secondSmallest);
    }
}

// 