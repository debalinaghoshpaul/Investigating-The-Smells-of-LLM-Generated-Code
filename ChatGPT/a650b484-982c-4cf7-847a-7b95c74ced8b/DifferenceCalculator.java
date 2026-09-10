public class DifferenceCalculator {

    public static void main(String[] args) {
        int[] arr = {12, 5, 9, 20, 3, 15};
        int difference = findDifference(arr);
        System.out.println("The difference between the largest and smallest values in the array is: " + difference);
    }

    public static int findDifference(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array must have at least 1 element.");
            return 0;
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return largest - smallest;
    }
}
