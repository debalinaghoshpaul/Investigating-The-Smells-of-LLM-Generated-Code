import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        
        if(num < 0 || num > 1000) {
            System.out.println("Please enter a number between 0 and 1000.");
            return;
        }
        
        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
}
