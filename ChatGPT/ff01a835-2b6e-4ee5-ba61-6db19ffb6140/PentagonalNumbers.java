import java.util.stream.IntStream;

public class PentagonalNumbers {

    public static void main(String[] args) {
        // Print the first 50 pentagonal numbers
        IntStream.range(1, 51).forEach(n -> System.out.printf("%4d", getPentagonalNumber(n)));
    }

    /**
     * Calculate the n-th pentagonal number
     * @param n the index of the pentagonal number to calculate
     * @return the n-th pentagonal number
     */
    public static int getPentagonalNumber(int n) {
        return (3 * n * n - n) / 2;
    }
}
