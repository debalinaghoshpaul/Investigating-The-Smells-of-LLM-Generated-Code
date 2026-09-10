public class CheckArray {

    public static boolean checkArray(int[] arr) {
        for (int num : arr) {
            if (num == 0 || num == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {0, 2, 4, 6, 8};
        int[] arr3 = {1, -1, 3, 5, 7};

        System.out.println("arr1 without 0 and -1: " + checkArray(arr1));
        System.out.println("arr2 without 0 and -1: " + checkArray(arr2));
        System.out.println("arr3 without 0 and -1: " + checkArray(arr3));
    }
}
