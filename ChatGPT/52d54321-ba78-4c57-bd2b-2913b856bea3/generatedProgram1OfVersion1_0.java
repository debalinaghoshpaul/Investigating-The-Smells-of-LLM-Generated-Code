public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 4, 12};

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != firstSmallest) {
                secondSmallest = arr[i];
            }
        }

        if(secondSmallest != Integer.MAX_VALUE) {
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        } else {
            System.out.println("No second smallest element found in the array.");
        }
    }
}
