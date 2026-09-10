public class Exponentiation {
    public static long expEvaluate(int x, int m) {
        if (m == 0) {
            return 1;
        } else {
            return x * expEvaluate(x, m - 1);
        }
    }

    public static void main(String[] args) {
        int x = 2; // Example value for x
        int m = 3; // Example value for m

        // Check if x and m are within the specified range
        if (x > 0 && x <= 10 && m >= 0 && m <= 10) {
            long result = expEvaluate(x, m);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid input values. Please make sure x is in the range 0 < x <= 10 and m is in the range 0 <= m <= 10.");
        }
    }
}