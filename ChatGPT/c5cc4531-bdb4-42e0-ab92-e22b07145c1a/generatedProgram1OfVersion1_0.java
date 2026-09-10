public class Main {
    public static void main(String[] args) {
        double number = 10.5; // The given floating/double number

        double nextPositiveInfinity = Math.nextUp(Double.POSITIVE_INFINITY);
        double nextNegativeInfinity = Math.nextAfter(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);

        System.out.println("Next floating-point adjacent to positive infinity from " + number + " : " + nextPositiveInfinity);
        System.out.println("Next floating-point adjacent to negative infinity from " + number + " : " + nextNegativeInfinity);
    }
}
