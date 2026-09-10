public class RoundUpDivision {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        if (remainder > 0) {
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
    }
}
