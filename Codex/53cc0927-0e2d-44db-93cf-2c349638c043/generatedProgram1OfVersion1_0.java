public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num = 3;
        int size = arr.length;

        boolean result = searchList(arr, size, num);
        System.out.println(result);
    }

    public static boolean searchList(int[] a, int size, int num) {
        if (size == 0) {
            return false;
        } else if (a[size - 1] == num) {
            return true;
        } else {
            return searchList(a, size - 1, num);
        }
    }
}