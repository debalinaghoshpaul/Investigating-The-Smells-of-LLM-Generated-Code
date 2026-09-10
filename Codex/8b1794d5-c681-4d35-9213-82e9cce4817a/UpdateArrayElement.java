public class UpdateArrayElement {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {1, 2, 3, 4, 5};

        // Display the original array
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Update the array element
        int index = 2; // Index of the element to update
        int newValue = 10; // New value to be assigned
        arr[index] = newValue;

        // Display the updated array
        System.out.println("Updated Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
