import java.util.Scanner;

public class RoundFloatValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a float value: ");
        float number = scanner.nextFloat();
        
        float roundedValue = Math.round(number);
        
        System.out.println("Rounded value: " + roundedValue);
        
        scanner.close();
    }
}