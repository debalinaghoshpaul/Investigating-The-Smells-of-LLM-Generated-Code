public class CalculateAverageValue {

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25}; // array elements

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // calculate sum of array elements
        }

        double average = sum / arr.length; // calculate average

        System.out.println("Average value of array elements: " + average);
    }
}
