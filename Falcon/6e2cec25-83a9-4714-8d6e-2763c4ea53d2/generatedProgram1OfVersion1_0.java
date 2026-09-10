import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == 15 || num2 == 15 || num1 + num2 == 15) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

