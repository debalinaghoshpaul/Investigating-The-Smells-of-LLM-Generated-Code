public class ExpressionEvaluation {

    public static void main(String[] args) {
        // a) 101 + 0) / 3
        System.out.println((101 + 0) / 3); // 33

        // b) 3.0e-6 * 10000000.1
        System.out.println(3.0e-6 * 10000000.1); // 3.00000003

        // c) true && true
        System.out.println(true && true); // true

        // d) false && true
        System.out.println(false && true); // false

        // e) (false && false) || (true && true)
        System.out.println((false && false) || (true && true)); // true

        // f) (false || false) && (true && true)
        System.out.println((false || false) && (true && true)); // false
    }
}
