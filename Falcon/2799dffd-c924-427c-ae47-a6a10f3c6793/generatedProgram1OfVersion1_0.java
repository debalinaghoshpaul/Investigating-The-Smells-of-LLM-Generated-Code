import java.util.Scanner;

public class Module {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = 0;
        if (num1 > num2) {
            result = num1 % num2;
        } else {
            result = num2 % num1;
        }
        System.out.println("Modules of " + num1 + " and " + num2 + " are : " + result);
    }
}

