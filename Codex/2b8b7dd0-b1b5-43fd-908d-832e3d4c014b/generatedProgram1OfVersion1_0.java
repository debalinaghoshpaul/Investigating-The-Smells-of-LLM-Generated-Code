import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int temp = number;
        
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        
        System.out.println("The sum of all digits in " + number + " is " + sum);
    }
}