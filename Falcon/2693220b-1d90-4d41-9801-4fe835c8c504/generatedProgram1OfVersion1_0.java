import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        if (num == 0) {
            System.out.println("Zero");
        } else if (num < 0) {
            System.out.println("Negative");
        } else if (num > 1000000) {
            System.out.println("Positive");
        } else {
            System.out.println("Large");
        }
    }
}

// 