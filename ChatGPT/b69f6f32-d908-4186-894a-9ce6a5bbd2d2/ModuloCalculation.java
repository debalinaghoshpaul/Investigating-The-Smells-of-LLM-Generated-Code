import java.util.Scanner;

public class ModuloCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        
        long result = calculateModulo(x, n, y);
        
        System.out.println("Result: " + result);
    }
    
    public static long calculateModulo(int x, int n, int y) {
        long result = 1;
        long base = x % y;
        
        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * base) % y;
            }
            base = (base * base) % y;
            n = n / 2;
        }
        
        return result;
    }
}
