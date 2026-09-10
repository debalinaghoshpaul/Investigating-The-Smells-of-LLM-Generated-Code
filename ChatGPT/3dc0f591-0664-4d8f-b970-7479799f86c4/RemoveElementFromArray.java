import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elementToRemove = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));

        arr = removeElement(arr, elementToRemove);

        System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(arr));
    }

    public static int[] removeElement(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int[] newArr = new int[arr.length - 1];
            int newIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[newIndex] = arr[i];
                    newIndex++;
                }
            }
            return newArr;
        } else {
            return arr;
        }
    }
}
