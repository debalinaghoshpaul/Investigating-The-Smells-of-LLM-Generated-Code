import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        double result = calculateExponential(x, n);
        
        System.out.println("e^" + x + " = " + result);
    }
    
    public static double calculateExponential(double x, int n) {
        double sum = 1.0;
        double term = 1.0;
        
        for (int i = 1; i <= n; i++) {
            term *= x / i;
            sum += term;
        }
        
        return sum;
    }
}
