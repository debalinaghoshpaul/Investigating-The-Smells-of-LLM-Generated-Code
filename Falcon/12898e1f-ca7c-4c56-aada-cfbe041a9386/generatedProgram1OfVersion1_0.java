import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int mul = num1 * num2;
        int sub = num1 - num2;
        int div = num1 / num2;
        int rem = num1 % num2;

        System.out.println("Sum = " + sum);
        System.out.println("Multiply = " + mul);
        System.out.println("Subtract = " + sub);
        System.out.println("Divide = " + div);
        System.out.println("Remainder = " + rem);
    }
}

