
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {10, 25, 13, 50, 17, 32};

        int secondLargest = findSecondLargest(arr);

        System.out.println("Second largest element in the array is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        if (n < 2) {
            System.out.println("Array should have at least 2 elements");
            return -1;
        }

        return arr[n - 2];
    }

}
