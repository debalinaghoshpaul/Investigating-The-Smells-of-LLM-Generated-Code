import java.util.Arrays;

public class LargestElements {
    public static void main(String[] args) {
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        int[] result = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("3 largest elements of the said array are: " + Arrays.toString(result));
    }
}

// 