import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isFibonacci(number)) {
            System.out.println(number + " is a Fibonacci number.");
        } else {
            System.out.println(number + " is not a Fibonacci number.");
        }
    }
    
    public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;
        
        while (b < number) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        
        return b == number;
    }
}