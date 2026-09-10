import java.util.Arrays;

public class MultithreadedSort {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 4, 3, 7, 9, 6};
        System.out.println("Original array: " + Arrays.toString(array));

        Thread mergeSortThread = new Thread(() -> {
            mergeSort(array, 0, array.length - 1);
        });
        mergeSortThread.start();

        try {
            mergeSortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            Thread leftSort = new Thread(() -> {
                mergeSort(array, left, mid);
            });
            leftSort.start();

            Thread rightSort = new Thread(() -> {
                mergeSort(array, mid + 1, right);
            });
            rightSort.start();

            try {
                leftSort.join();
                rightSort.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
