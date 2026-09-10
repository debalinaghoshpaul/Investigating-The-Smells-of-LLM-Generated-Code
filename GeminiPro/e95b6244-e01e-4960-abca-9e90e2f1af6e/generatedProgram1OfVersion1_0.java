import java.util.Arrays;

public class InsertElementToArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;
        int element = 10;

        // Insert element at the specified index
        arr = insertElement(arr, index, element);

        // Print the updated array
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertElement(int[] arr, int index, int element) {
        // Check if the index is valid
        if (index < 0 || index > arr.length) {
            throw new IllegalArgumentException("Invalid index");
        }

        // Create a new array with the increased size
        int[] newArr = new int[arr.length + 1];

        // Copy the elements before the insertion point to the new array
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // Insert the element at the specified index
        newArr[index] = element;

        // Copy the elements after the insertion point to the new array
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        // Return the new array
        return newArr;
    }
}
