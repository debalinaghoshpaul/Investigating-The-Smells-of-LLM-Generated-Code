public class ArrayCopy {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];

        // Copying the array by iterating
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Printing the original array
        System.out.print("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Printing the copied array
        System.out.print("Copied Array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }

    }
}
