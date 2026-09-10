public class ProductOfArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println(productOfArray(arr));
    }

    public static int productOfArray(int[] arr) {
        return productOfArray(arr, 0);
    }

    public static int productOfArray(int[] arr, int index) {
        if (index >= arr.length) {
            return 1;
        }

        return arr[index] * productOfArray(arr, index + 1);
    }
}
