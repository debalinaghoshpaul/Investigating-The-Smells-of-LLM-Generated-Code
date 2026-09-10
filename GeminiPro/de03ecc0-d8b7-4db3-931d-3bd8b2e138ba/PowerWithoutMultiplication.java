import java.lang.*;
import java.util.*;

public class PowerWithoutMultiplication {

    public static void main(String[] args) {
        // Test cases
        System.out.println(power(2, 3)); // 8
        System.out.println(power(5, 2)); // 25
        System.out.println(power(10, 0)); // 1
        System.out.println(power(0, 10)); // 0
        System.out.println(power(0, 0)); // 1
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            return 1 / power(base, -exponent);
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
