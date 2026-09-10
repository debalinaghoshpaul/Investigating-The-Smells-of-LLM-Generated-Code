import java.util.Scanner;

public class ConversionProgram {

    public static void main(String[] args) {
        // Problem 1: Convert inches to meters
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for inch: ");
        double inch = scanner.nextDouble();
        
        double meters = inch * 0.0254;
        System.out.println(inch + " inches is " + meters + " meters");

        // Problem 2: Add all digits in an integer between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");
        int num = scanner.nextInt();
        
        if(num < 0 || num > 1000) {
            System.out.println("Please enter a valid integer between 0 and 1000");
            System.exit(0);
        }
        
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("The sum of digits is: " + sum);
        
        scanner.close();
    }

}
