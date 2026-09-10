import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
    public static void main(String[] args) {
        // Example 2D array
        double[][] myArr = {
            {1, 5},
            {13, 1.55},
            {12, 100.6},
            {12.1, 0.85}
        };

        // Sort the 2D array based on the first column
        Arrays.sort(myArr, new Comparator<double[]>() {
            @Override
            public int compare(double[] a, double[] b) {
                return Double.compare(a[0], b[0]);
            }
        });

        // Display the sorted array
        System.out.println("Sorted array based on the first column:");
        for (double[] row : myArr) {
            System.out.println(row[0] + "  " + row[1]);
        }
    }
}
