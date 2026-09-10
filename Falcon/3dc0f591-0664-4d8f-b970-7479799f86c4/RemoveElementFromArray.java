import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementToRemove = 5;

        // Remove the element from the array
        int[] newArr = removeElement(arr, elementToRemove);

        // Print the new array
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] removeElement(int[] arr, int elementToRemove) {
        int[] newArr = new int[arr.length - 1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToRemove) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }
}
