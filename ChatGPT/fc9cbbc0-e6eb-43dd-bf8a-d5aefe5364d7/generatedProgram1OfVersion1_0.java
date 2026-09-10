import java.util.Arrays;

public class BinaryArraySort {

    public static void sortBinaryArray(int[] arr) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count++;
            }
        }

        for(int i = 0; i < count; i++) {
            arr[i] = 0;
        }

        for(int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        int[] b_nums = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};

        System.out.println("Before sorting: " + Arrays.toString(b_nums));

        sortBinaryArray(b_nums);

        System.out.println("After sorting: " + Arrays.toString(b_nums));
    }
}
