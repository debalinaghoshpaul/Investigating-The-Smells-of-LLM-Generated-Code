import java.util.Arrays;

public class KthSmallestLargestElement {

    public static void main(String[] args) {
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 2; // Example: 2nd smallest and largest element

        Arrays.sort(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("K'th smallest element of the said array: " + arr[k-1]);
        System.out.println("K'th largest element of the said array: " + arr[arr.length-k]);
    }
}
