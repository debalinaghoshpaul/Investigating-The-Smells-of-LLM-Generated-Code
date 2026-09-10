import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double number: ");
        double num = scanner.nextDouble();
        if (num % 1 == 0) {
            System.out.println(num + " is an integer.");
        } else {
            System.out.println(num + " is not an integer.");
        }
    }
}

