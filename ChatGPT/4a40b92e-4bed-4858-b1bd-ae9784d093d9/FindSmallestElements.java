public class FindSmallestElements {

    public static void main(String[] args) {
        int[] arr = {12, 45, 1, 78, 5, 19, 23};
        findSmallestElements(arr);
    }

    public static void findSmallestElements(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Invalid input: Array size should be at least 2");
            return;
        }
        
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Second smallest element: " + secondSmallest);
        }
    }
}
