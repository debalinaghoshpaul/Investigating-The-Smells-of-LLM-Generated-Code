import java.util.Arrays;

public class PellSeries {

    public static void main(String[] args) {
        int[] pellSeries = generatePellSeries(15);
        System.out.println(Arrays.toString(pellSeries));
    }

    public static int[] generatePellSeries(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("The number of terms must be positive");
        }

        int[] series = new int[n];
        series[0] = 0;
        series[1] = 1;

        for (int i = 2; i < n; i++) {
            series[i] = 2 * series[i - 1] + series[i - 2];
        }

        return series;
    }
}
