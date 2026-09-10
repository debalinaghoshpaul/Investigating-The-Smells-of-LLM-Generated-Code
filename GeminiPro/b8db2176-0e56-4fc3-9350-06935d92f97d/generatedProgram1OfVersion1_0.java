// Sortable interface
interface Sortable {
    void sort(int[] arr);
}

// BubbleSort class
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

// SelectionSort class
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}

// Test cases
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 2, 4, 3};
        int[] arr2 = {10, 9, 8, 7, 6};
        int[] arr3 = {1, 1, 1, 1, 1};
        int[] arr4 = {};
        int[] arr5 = null;

        Sortable sorter1 = new BubbleSort();
        Sortable sorter2 = new SelectionSort();

        sorter1.sort(arr1);
        sorter1.sort(arr2);
        sorter1.sort(arr3);
        sorter1.sort(arr4);
        sorter1.sort(arr5);

        sorter2.sort(arr1);
        sorter2.sort(arr2);
        sorter2.sort(arr3);
        sorter2.sort(arr4);
        sorter2.sort(arr5);
    }
}
