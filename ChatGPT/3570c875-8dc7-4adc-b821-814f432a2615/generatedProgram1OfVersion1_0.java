import java.util.Scanner;

public class CompareFloatNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input first floating point number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Input second floating point number: ");
        double num2 = input.nextDouble();
        
        if(Math.abs(num1 - num2) < 0.01) {
            System.out.println("These numbers are the same up to two decimal places.");
        } else {
            System.out.println("These numbers are different.");
        }
        
        input.close();
    }
}
