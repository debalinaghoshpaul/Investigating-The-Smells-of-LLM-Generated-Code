public class PolynomialEvaluation {
    public static void main(String[] args) {
        int x = 3;
        int result = evaluatePolynomial(x);
        System.out.println("Result: " + result);
    }

    public static int evaluatePolynomial(int x) {
        int result = -19;
        result = result + 7 * x;
        result = result - 4 * x;
        result = result + 6 * x;
        return result;
    }
}