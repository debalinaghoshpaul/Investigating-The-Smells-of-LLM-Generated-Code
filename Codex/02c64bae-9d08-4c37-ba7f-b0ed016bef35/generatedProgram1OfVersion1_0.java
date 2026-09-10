import java.util.Scanner;

public class NumberRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scanner.nextInt();
        
        // Upper half of the rhombus
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers in ascending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Print numbers in descending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }
        
        // Lower half of the rhombus
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers in ascending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Print numbers in descending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}