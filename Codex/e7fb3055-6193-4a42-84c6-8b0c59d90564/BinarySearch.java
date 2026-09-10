public class BinarySearch {
    public static <T extends Comparable<T>> int search(T[] array, T target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> int binarySearch(T[] array, T target, int low, int high) {
        if (low > high) {
            return -1; // target not found
        }

        int mid = (low + high) / 2;
        int compareResult = target.compareTo(array[mid]);

        if (compareResult == 0) {
            return mid; // target found
        } else if (compareResult < 0) {
            return binarySearch(array, target, low, mid - 1); // search left half
        } else {
            return binarySearch(array, target, mid + 1, high); // search right half
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = search(numbers, 7);
        System.out.println("Index of 7: " + index);

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        index = search(names, "Charlie");
        System.out.println("Index of 'Charlie': " + index);
    }
}
