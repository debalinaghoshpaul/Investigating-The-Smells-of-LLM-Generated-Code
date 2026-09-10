public class Exponentiation {

    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;

        long result = calculateExponentiation(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static long calculateExponentiation(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * calculateExponentiation(base, exponent - 1);
        }
    }
}
