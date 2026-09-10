import java.util.Scanner;

public class TestFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        if (num == 0.0) {
            System.out.println("The number is a finite floating-point value.");
        } else {
            System.out.println("The number is not a finite floating-point value.");
        }
    }
}

