import java.util.Arrays;

public class TriangleCount {

    public static int countTriangles(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }

        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] > arr[k] && arr[j] + arr[k] > arr[i] && arr[k] + arr[i] > arr[j]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 6};
        int[] arr2 = {3, 4, 5, 6, 7, 8};
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println(countTriangles(arr1)); // Output: 3
        System.out.println(countTriangles(arr2)); // Output: 12
        System.out.println(countTriangles(arr3)); // Output: 0
    }
}
