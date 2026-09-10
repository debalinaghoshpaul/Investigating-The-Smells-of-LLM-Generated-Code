
public class ArrayInsertion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int element = 10;
        int position = 3;

        // Create a new array with one extra element
        int[] newArr = new int[arr.length + 1];

        // Copy elements of original array up to the specified position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element at the specified position
        newArr[position] = element;

        // Copy remaining elements of original array
        for (int i = position + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        // Print the updated array
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Element to insert: " + element);
        System.out.println("Position to insert: " + position);
        System.out.println("Updated Array: " + Arrays.toString(newArr));
    }
}
