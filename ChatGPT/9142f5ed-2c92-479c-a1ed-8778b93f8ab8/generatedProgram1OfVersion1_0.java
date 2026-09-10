    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input the dividend and divisor
        System.out.print("Input the dividend: ");
        int dividend = input.nextInt();
        
        System.out.print("Input the divisor: ");
        int divisor = input.nextInt();
        
        double result = divide(dividend, divisor);
        
        // Output the result
        System.out.println("Result: " + result);
    }
    
    // Method to divide two integers using subtraction
    public static double divide(int dividend, int divisor) {
        int quotient = 0;
        
        while(dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }
        
        return quotient;
    }
}