public class ExpressionValue {

    public static void main(String[] args) {
        // a) 101 + 0) / 3
        double resultA = (101 + 0) / 3.0;
        System.out.println("Result (a) : " + resultA);
        
        // b) 3.0e-6 * 10000000.1
        double resultB = 3.0e-6 * 10000000.1;
        System.out.println("Result (b) : " + resultB);
        
        // c) true && true
        boolean resultC = true && true;
        System.out.println("Result (c) : " + resultC);
        
        // d) false && true
        boolean resultD = false && true;
        System.out.println("Result (d) : " + resultD);
        
        // e) (false && false) || (true && true)
        boolean resultE = (false && false) || (true && true);
        System.out.println("Result (e) : " + resultE);
        
        // f) (false || false) && (true && true)
        boolean resultF = (false || false) && (true && true);
        System.out.println("Result (f) : " + resultF);
    }

}
