import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (num1 == num2) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
}

