import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        double[][] myArr = {
            {1, 5},
            {13, 1.55},
            {12, 100.6},
            {12.1, 0.85}
        };

        // Sort the array based on the values of myArr[][0]
        Arrays.sort(myArr, (a, b) -> Double.compare(a[0], b[0]));

        // Print the sorted array
        for (double[] row : myArr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}