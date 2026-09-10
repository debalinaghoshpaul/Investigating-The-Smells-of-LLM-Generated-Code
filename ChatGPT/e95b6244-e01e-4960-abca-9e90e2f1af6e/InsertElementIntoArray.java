import java.util.Arrays;

public class InsertElementIntoArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 10;
        int position = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));
        arr = insertElement(arr, element, position);
        System.out.println("Array after inserting " + element + " at position " + position + ": " + Arrays.toString(arr));
    }

    public static int[] insertElement(int[] arr, int element, int position) {
        int[] newArr = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        return newArr;
    }
}
