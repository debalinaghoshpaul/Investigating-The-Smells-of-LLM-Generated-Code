import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two integers
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();
        
        // Compute the sum
        int sum = num1 + num2;
        
        // Calculate the number of digits in the sum
        int digitCount = String.valueOf(Math.abs(sum)).length();
        
        System.out.println("Number of digits in the sum of " + num1 + " and " + num2 + " is: " + digitCount);
        
        sc.close();
    }
}
