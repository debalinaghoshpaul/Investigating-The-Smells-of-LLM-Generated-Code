public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = getPivotIndex(arr, low, high);
            int pivot = arr[pivotIndex];
            int i = low;
            int j = high;

            while (i <= j) {
                while (arr[i] < pivot) {
                    i++;
                }
                while (arr[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    swap(arr, i, j);
                    i++;
                    j--;
                }
            }

            if (low < j) {
                quickSort(arr, low, j);
            }
            if (high > i) {
                quickSort(arr, i, high);
            }
        }
    }

    public static int getPivotIndex(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        int[] tempArr = {arr[low], arr[mid], arr[high]};
        Arrays.sort(tempArr);
        return Arrays.binarySearch(arr, tempArr[1]);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}