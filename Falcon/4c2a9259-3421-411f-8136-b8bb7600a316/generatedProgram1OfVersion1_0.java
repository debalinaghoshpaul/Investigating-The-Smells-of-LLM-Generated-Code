import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        if (sum > 80) {
            System.out.println("Overflow");
        } else {
            System.out.println("Sum = " + sum);
        }
    }
}

// 