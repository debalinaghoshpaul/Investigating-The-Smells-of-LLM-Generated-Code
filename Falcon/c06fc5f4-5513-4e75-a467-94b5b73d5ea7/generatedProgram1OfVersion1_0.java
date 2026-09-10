public class ArrayShift {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int shiftedArr[] = new int[n];
        int i = 0;
        for (int j = 0; j < n; j++) {
            shiftedArr[i] = arr[j];
            i++;
        }
        System.out.println("Shifted array: ");
        for (int j = 0; j < n; j++) {
            System.out.print(shiftedArr[j] + " ");
        }
    }
}

