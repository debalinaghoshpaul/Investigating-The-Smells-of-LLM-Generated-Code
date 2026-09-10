public class Swap {
    public static void main(String[] args) {
        int arr[] = {20, 30, 40};
        int n = arr.length;
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("New array after swaping the first and last elements: " + Arrays.toString(arr));
    }
}

// 