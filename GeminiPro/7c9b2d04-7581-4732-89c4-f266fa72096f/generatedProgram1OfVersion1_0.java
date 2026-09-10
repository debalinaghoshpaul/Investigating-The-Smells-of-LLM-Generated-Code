import java.util.Arrays;

public class SmallerElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] result = countSmallerElements(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] countSmallerElements(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            int count = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
}
