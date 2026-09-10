import java.util.*;

public class AverageValue {

    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Find the largest and smallest values in the array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Calculate the average value of the array, excluding the largest and smallest values
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] != min) {
                average += arr[i];
            }
        }
        average /= (arr.length - 2);

        // Print the average value
        System.out.println("The average value of the array, excluding the largest and smallest values, is: " + average);
    }
}
