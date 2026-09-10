public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15, 30};
        int max = findMax(arr, 0);
        System.out.println("The maximum element in the array is: " + max);
    }

    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            int max = findMax(arr, index + 1);
            return Math.max(arr[index], max);
        }
    }
}
