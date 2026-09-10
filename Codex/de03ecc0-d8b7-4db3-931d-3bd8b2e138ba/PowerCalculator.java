public class PowerCalculator {
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        
        int result = base;
        int increment = base;
        
        for (int i = 1; i < exponent; i++) {
            for (int j = 1; j < base; j++) {
                result += increment;
            }
            increment = result;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        
        int power = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + power);
    }
}
