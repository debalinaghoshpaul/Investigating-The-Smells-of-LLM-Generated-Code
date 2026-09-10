import java.util.Arrays;

public class CountTriangles {

    public static int countTriangles(int[] arr) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < arr.length - 1; j++) {
                while (k < arr.length && arr[i] + arr[j] > arr[k]) {
                    k++;
                }
                count += k - j - 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7};
        System.out.println("Number of possible triangles: " + countTriangles(arr));
    }
}
